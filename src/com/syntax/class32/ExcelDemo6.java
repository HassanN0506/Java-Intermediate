package com.syntax.class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo6 {

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\hassa\\OneDrive\\Desktop\\Batch12\\32_1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        //A list of maps to store the data from excel. Each map will store the data from each row.
        List<Map<String, String>> excelData = new ArrayList<>();

        //Getting the header from the excel file, so that we can use the data from this header row for
        // the keys for the maps (First Name, Last Name, etc.)
        Row headerRow = sheet.getRow(0);

        //write a loop to get all the rows from the sheet, except for the 1st row, which is the header.
        for(int j=1; j<sheet.getPhysicalNumberOfRows(); j++) { //starting at 1 to skip the header.

            Row row = sheet.getRow(j); //iterates through each row.
            LinkedHashMap<String, String> rowData = new LinkedHashMap<>(); //each row gets its own map.
            //(if we used the SAME map for each row, it would simply get overwritten each time it looped.)

            //nested for loop to iterate through each cell of each row.
            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
                rowData.put(headerRow.getCell(i).toString(), row.getCell(i).toString());
                //putting in entries into the map.
                //for each row, it's:
                //Setting the key to the header of that column,
                // and setting the value to whatever is inside the cell.
                //(HAVE to use toString method)
            }

            excelData.add(rowData); //adding each row map to the list.
        }

        System.out.println(excelData);
    }
}

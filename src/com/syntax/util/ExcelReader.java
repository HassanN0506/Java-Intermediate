package com.syntax.util;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    public static List<Map<String, String>> getData(String path, String sheetName) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet(sheetName);

        //A list of maps to store the data from excel. Each map will store the data from each row.
        List<Map<String, String>> excelData = new ArrayList<>();

        //Getting the header from the excel file, so that we can use the data from this header row for
        // the keys for the maps (First Name, Last Name, etc.)
        Row headerRow = sheet.getRow(0);

        //Loop to get all the rows from the sheet, except for the 1st row, which is the header.
        for(int j=1; j<sheet.getPhysicalNumberOfRows(); j++) { //starting at 1 to skip the header.

            Row row = sheet.getRow(j); //iterates through each row.
            LinkedHashMap<String, String> rowData = new LinkedHashMap<>(); //each row gets its own map.

            //nested for loop to iterate through each cell of each row.
            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
                rowData.put(headerRow.getCell(i).toString(), row.getCell(i).toString());
                //putting in entries into the map.
                //for each row, it's:
                //Setting the key to the header of that column,
                // and setting the value to whatever is inside the cell.
            }

            excelData.add(rowData); //adding each row map to the list.
        }

        return excelData; //returning the list
    }

}

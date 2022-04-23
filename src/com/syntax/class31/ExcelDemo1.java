package com.syntax.class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo1 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\hassa\\OneDrive\\Desktop\\Batch12\\Names.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);

        //the special class we use to handle Excel files:
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        //no " .load()" method, just pass the fileInputStream object directly into the constructor of this class

        //use the " .getSheet()" method to access the specific sheet of the Excel file
        //getting the sheet and storing it in a "Sheet" variable:
        Sheet sheet1 = xssfWorkbook.getSheet("Sheet1");
        //(must specify by the sheet's name, which is by default set to Sheet1)

        //use the " .getRow()" method to access the specific row of the sheet
        //getting the row and storing it in a "Row" variable:
        Row row1 = sheet1.getRow(0);
        //(must specify by row index, and the indexes start w/ 0)

        //use the " .getCell()" method to access the specific cell of the row
        //getting the cell and storing it in a "Cell" variable:
        Cell cellA = row1.getCell(0);
        //(must specify by index of COLUMN, and the indexes start w/ 0)

        System.out.println(cellA);

    }
}

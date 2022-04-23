package com.syntax.class32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo3 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\hassa\\OneDrive\\Desktop\\Batch12\\Names.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xlsx = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xlsx.getSheet("Sheet1");

        //creating a nested for loop to get all the data:
        for(int i = 0; i < sheet.getPhysicalNumberOfRows(); i++){
            //" .getPhysicalNumberOfRows()" method makes the loop dynamic
            Row thisRow = sheet.getRow(i);
            for(int j = 0; j < thisRow.getPhysicalNumberOfCells(); j++){
                //" .getPhysicalNumberOfCells()" method makes the loop dynamic
                Cell cell = thisRow.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }
    }
}

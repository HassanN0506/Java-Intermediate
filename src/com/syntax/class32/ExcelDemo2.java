package com.syntax.class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\hassa\\OneDrive\\Desktop\\Batch12\\Names.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xlsx = new XSSFWorkbook(fileInputStream);

        Sheet sheet = xlsx.getSheet("Sheet1");

        //to get the index of the sheet:
        System.out.println(xlsx.getSheetIndex("Sheet1"));

        //method chaining to get a specific cell in 1 line of code:
        System.out.print(sheet.getRow(0).getCell(0)+" ");
        System.out.println(sheet.getRow(0).getCell(1));

        System.out.print(sheet.getRow(1).getCell(0)+" ");
        System.out.println(sheet.getRow(1).getCell(1));

        System.out.print(sheet.getRow(2).getCell(0)+" ");
        System.out.println(sheet.getRow(2).getCell(1));

        System.out.print(sheet.getRow(3).getCell(0)+" ");
        System.out.println(sheet.getRow(3).getCell(1));

//        System.out.print(sheet.getRow(4).getCell(0)+" ");
//        System.out.println(sheet.getRow(4).getCell(1));
        /*
        this row does not contain any data, so we get a NullPointerException
         */
    }
}

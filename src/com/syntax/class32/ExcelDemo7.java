package com.syntax.class32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo7 {

    public static void main(String[] args) throws IOException {

        //adding on to an excel file:

        String path = "C:\\Users\\hassa\\OneDrive\\Desktop\\Batch12\\32_1.xlsx";

        /*
        You have to first save the current stuff, so that it doesn't just get overwritten.
        Because everytime you edit a file, you're really REPLACING it with a new file (like in Strings).
        */
        FileInputStream fileInputStream = new FileInputStream(path); //reads the existing data in the file
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream); //sets the existing data in the new file,

        Sheet sheet = xssfWorkbook.getSheet("Sheet1"); //navigating to the sheet

        //I want to write in the next row:
        Row row = sheet.createRow(5); //index of the next row down
        row.createCell(0).setCellValue("Asel"); //firstname
        row.createCell(1).setCellValue("Kiyatova"); //lastname
        row.createCell(2).setCellValue(20); //age (integer, so it doesn't need "")
        row.createCell(3).setCellValue("New York"); //city

        //uploading the new stuff:
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);

    }
}

package com.syntax.class32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo4 {
    public static void main(String[] args) throws IOException {

        //creating a new file in this location with this specified name and type:
        String path = "C:\\Users\\hassa\\OneDrive\\Desktop\\Batch12\\32_1.xlsx";

        FileOutputStream fileOutputStream = new FileOutputStream(path);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();

        Sheet sheet = xssfWorkbook.createSheet("Sheet1");
        //" .createSheet()" method to create a sheet

        Row row = sheet.createRow(0);
        //" .createRow()" method to create a sheet

        Cell cell = row.createCell(0);
        //" .createCell()" method to create a sheet

        cell.setCellValue("Ali");
        //" .setCellValue()" method to set the cell's value

        //VERY IMPORTANT:
        xssfWorkbook.write(fileOutputStream);
        //" .write()" method to upload everything into that file
        // (only for EXCEL files)

    }
}

package com.syntax.class33;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyDemo {
    public static void main(String[] args) {

        FileInputStream fileInputStream=null; //we have to declare it out here so that it's not LOCAL to the try block.

        try {
            String path = "C:\\Users\\hassa\\OneDrive\\Desktop\\Batch12\\32_1.xlsx";
            fileInputStream = new FileInputStream(path); //behaves the same as opening the file,
            // so it needs to be closed
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        }
        catch (FileNotFoundException fnf){
            System.out.println("The file that you are trying to read is not present on the provided path.");
        }
        catch (IOException ioe){
            System.out.println("Something with the hard drive went wrong");
        }
        finally { //'finally' block is ALWAYS executed at the end of the TryCatch block
            try {
                fileInputStream.close(); //closing the file at the end of the program
            } catch (IOException e) {
                System.out.println("ERROR, whilst closing the file");
            }
        }

        System.out.println("Now you should be able to perform other operations");
    }
}

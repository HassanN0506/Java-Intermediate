package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFilesDemo4 {
    public static void main(String[] args) throws IOException {

        //adding to an already existing file:

        String path = "Files/Config.properties";

        //BUT IT OVERWRITES EVERYTHING THAT IS ALREADY SAVED IN THE FILE,
        // UNLESS WE DO THIS FIRST:
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);

        //and then do the rest to add on:
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        properties.put("URL", "www.google.com");
        properties.store(fileOutputStream,"Added new property URL");

        //BUT IT JUMBLES UP ALL THE ENTRIES IN THAT FILE (DOES NOT MAINTAIN INSERTION ORDER)
        //because Properties is a child class of Hashtable

    }
}

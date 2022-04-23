package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
Create a property file to store following configurations:
browser=chrome
url=https://facebook.com
username
password
Read file and extract values of browser & url
 */
public class Task {
    public static void main(String[] args) throws IOException {

        //creating file:
        String path = "C:\\Users\\hassa\\OneDrive\\Desktop\\Batch12\\Class31Task.properties";
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        //storing keys and values:
        Properties properties = new Properties();
        properties.put("browser", "chrome");
        properties.put("url", "https://facebook.com");
        properties.put("username", "hassan nawaz");
        properties.put("password", "passwordpassword");
        properties.store(fileOutputStream, "created file and added fields");

        //extracting browser and url
        FileInputStream fileInputStream = new FileInputStream(path);
        properties.load(fileInputStream);
        System.out.println(properties.get("browser"));
        System.out.println(properties.get("url"));

    }
}

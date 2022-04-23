package com.syntax.class31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFilesDemo3 {
    public static void main(String[] args) throws IOException {

        //we are CREATING a new file now, at this location:
        String path = "C:\\Users\\hassa\\OneDrive\\Desktop\\Batch12\\Trump.properties";

        //OUTPUT STREAM this time
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        //That special class which knows how to WRITE in the " .properties" file
        Properties properties = new Properties();

        //we use .put() method like in maps to set the keys and values
        properties.put("isCrazy", "false");
        properties.put("isRich", "true");

        //STORING all the data from the Properties object to the file
        properties.store(fileOutputStream, "Added some new fields");
        //comments are there to specify what you did (like in Git)

    }
}

package org.example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class HandleOption {
    static String name = "";
    static String message = "";
    static void printInputStream(InputStream is, Class clas) {
        try {
            InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(streamReader);
            name = clas.getSimpleName();
            switch (name) {
                case "FileToConsole" -> FileToConsole.printFile(reader);
                case "FileToFile" -> FileToFile.printFile(reader);
                default -> {
                    message = "Wrong Class";
                    System.out.println("Wrong Class");
                }
            }


        } catch (Exception e) {
            message = "Error_File_Corrupted";
            System.out.println("Error_File_Corrupted");
            e.printStackTrace();
        }
    }
}

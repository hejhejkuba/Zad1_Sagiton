package org.example;

import java.io.BufferedReader;
import java.io.IOException;

public class FileToConsole {
    static String  text = "";


    static void printFile(BufferedReader reader) throws IOException {
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        line = stringBuilder.toString();
        text = line.replaceAll("\\s+", "");
        System.out.println(text);
    }

}

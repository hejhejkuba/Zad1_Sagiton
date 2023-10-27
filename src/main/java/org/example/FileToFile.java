package org.example;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileToFile {
    static void printFile(BufferedReader reader) throws IOException {
        FileWriter fileWriter = new FileWriter(Main.class.getClassLoader().getResource("fileWrite.txt").getPath());
        PrintWriter printWriter = new PrintWriter(fileWriter);
        String line;
        while ((line = reader.readLine()) != null) {
            printWriter.print(line.replaceAll("\\s+", ""));
        }
        printWriter.close();
    }






}

package org.example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Main {
    public InputStream getFileFromResourceAsStream(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);
        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        }
            return inputStream;


    }

    public void printInputStream(InputStream is) {
        try {
            InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(streamReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line.replaceAll("\\s+", ""));
            }
        } catch (Exception e) {
            System.out.println("Error_File_Corrupted");
        }
    }

    public String getFileName() {
        System.out.println("Wpisz nazwe pliku w konsoli");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        return filename;
    }

    public static void main(String[] args) {


        Main main = new Main();


        InputStream is = main.getFileFromResourceAsStream(main.getFileName());


        main.printInputStream(is);

    }

}
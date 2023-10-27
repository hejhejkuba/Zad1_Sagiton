package org.example;

import java.io.InputStream;
import java.util.Scanner;

public class FileIn {
    static private Scanner scanner = new Scanner(System.in);

    public FileIn(Scanner scanner) {
        FileIn.scanner = scanner;
    }
    static String getFileName() {
        System.out.println("Wpisz nazwe pliku w konsoli");
        return scanner.nextLine();
    }
    static InputStream getFileFromResourceAsStream(String fileName) {
        ClassLoader fileClassLocation = Main.class.getClassLoader();
        InputStream inputStream = fileClassLocation.getResourceAsStream(fileName);
        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        }
        return inputStream;
    }
}

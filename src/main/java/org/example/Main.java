package org.example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Main {

    /*
     * 1. Oddzielić odpowiedzialności na oddzielne klasy
     * 2. Testy jednostkowe mają sprawdzać dokładnie funkcjonalność metody
     * 3. System.setIn(), setOut() - zabronione
     * 4. Zaprojektuj ten system tak, by można było łatwo podmienić konsolę na np. fileWriter
     */






    public static void main(String[] args) {
    InputStream is = FileIn.getFileFromResourceAsStream(FileIn.getFileName());
    FileOut.printInputStream(is);
    }

}
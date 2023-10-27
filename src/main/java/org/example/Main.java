package org.example;

import java.io.InputStream;


public class Main {

    /*
     * 1. Oddzielić odpowiedzialności na oddzielne klasy
     * 2. Testy jednostkowe mają sprawdzać dokładnie funkcjonalność metody
     * 3. System.setIn(), setOut() - zabronione
     * 4. Zaprojektuj ten system tak, by można było łatwo podmienić konsolę na np. fileWriter
     * 5. wywal static
     * 6. zrob factory z handle option
     * 7. pozbyc sie system.out
     */






    public static void main(String[] args) {
    InputStream is = FileIn.getFileFromResourceAsStream(FileIn.getFileName());
    HandleOption.printInputStream(is, FileToFile.class);
    }

}
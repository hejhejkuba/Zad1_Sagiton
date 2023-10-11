package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void fileNotExist() {
        assertThrows(IllegalArgumentException.class,
                ()->{
                    FileIn.getFileFromResourceAsStream("file4.txt");
                });
    }

    @Test
    void fileExist() {
        assertNotNull(FileIn.getFileFromResourceAsStream("file.txt"));
    }

    @Test
    void printNotError() {
        InputStream is = FileIn.getFileFromResourceAsStream("file.txt");
        assertAll(() -> FileOut.printInputStream(is));
    }
}
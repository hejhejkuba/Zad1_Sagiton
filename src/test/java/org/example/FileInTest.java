package org.example;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FileInTest {
    Scanner mockScanner = mock(Scanner.class);
    @Test
    void getFileName() {

        new FileIn(mockScanner);
        when(mockScanner.nextLine()).thenReturn("file.txt");
        assertEquals("file.txt", FileIn.getFileName());
        verify(mockScanner).nextLine();
    }
    @Test
    void getFileNameEqualsNull() {
        new FileIn(mockScanner);
        assertEquals(null, FileIn.getFileName());
        verify(mockScanner).nextLine();
    }

    @Test
    void getFileFromResourceAsStreamExist() {
        assertNotNull(FileIn.getFileFromResourceAsStream("file.txt"));
    }
    @Test
    void getFileFromResourceAsStreamNull() {
        assertThrows(IllegalArgumentException.class,
                ()->{
                    FileIn.getFileFromResourceAsStream("file4.txt");
                });
    }
    //dodaj sprawdzanie zawartosci pliku
}
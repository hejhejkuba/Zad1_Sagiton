package org.example;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class HandleOptionTest {
    Scanner mockScanner = mock(Scanner.class);
    @Test
    void printInputStreamFile() {
        new FileIn(mockScanner);
        when(mockScanner.nextLine()).thenReturn("file.txt");
        InputStream is = FileIn.getFileFromResourceAsStream(FileIn.getFileName());
        HandleOption.printInputStream(is, FileToFile.class);
        assertEquals(HandleOption.name, "FileToFile");
    }
    @Test
    void printInputStreamConsole() {
        new FileIn(mockScanner);
        when(mockScanner.nextLine()).thenReturn("file.txt");
        InputStream is = FileIn.getFileFromResourceAsStream(FileIn.getFileName());
        HandleOption.printInputStream(is, FileToConsole.class);
        assertEquals(HandleOption.name, "FileToConsole");
    }
    @Test
    void printInputStreamDefault() {
        new FileIn(mockScanner);
        when(mockScanner.nextLine()).thenReturn("file.txt");
        InputStream is = FileIn.getFileFromResourceAsStream(FileIn.getFileName());
        HandleOption.printInputStream(is, Main.class);
        assertEquals(HandleOption.message, "Wrong Class");
    }
    @Test
    void printInputStreamError()
    {
        new FileIn(mockScanner);
        when(mockScanner.nextLine()).thenReturn("file.txt");
        InputStream is = FileIn.getFileFromResourceAsStream(FileIn.getFileName());
        HandleOption.printInputStream(is, null);
        assertEquals(HandleOption.message, "Error_File_Corrupted");
    }

}
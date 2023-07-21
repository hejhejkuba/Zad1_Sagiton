package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main;
    @BeforeEach
    void setUp()
    {
        main = new Main();
    }
    @Test
    void FileNotExist()
    {

        assertThrows(IllegalArgumentException.class,
                ()->{
                    main.getFileFromResourceAsStream("file4.txt");
                });

    }
    @Test
    void FileExist()
    {
        assertNotNull(main.getFileFromResourceAsStream("file.txt"));
    }
    @Test
    void PrintNotError()
    {
        InputStream is = main.getFileFromResourceAsStream("file.txt");
        assertAll(() -> main.printInputStream(is));
    }
}
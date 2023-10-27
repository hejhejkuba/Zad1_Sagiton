package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Target;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FileToFileTest {
    Scanner mockScanner = mock(Scanner.class);
    @Test
    void printFile() throws IOException, URISyntaxException {
        String textCheck = "Loremipsumdolorsitamet,consecteturadipiscingelit,seddoeiusmodtemporincididuntutlaboreetdoloremagnaaliqua.Utenimadminimveniam,quisnostrudexercitationullamcolaborisnisiutaliquipexeacommodoconsequat.Duisauteiruredolorinreprehenderitinvoluptatevelitessecillumdoloreeufugiatnullapariatur.Excepteursintoccaecatcupidatatnonproident,suntinculpaquiofficiadeseruntmollitanimidestlaborum.";


        new FileIn(mockScanner);
        when(mockScanner.nextLine()).thenReturn("file.txt");

        InputStream is = FileIn.getFileFromResourceAsStream(FileIn.getFileName());
        HandleOption.printInputStream(is, FileToFile.class);
        //zrobic mocki na zapisywanie plikow lub temp

        URL path = Main.class.getClassLoader().getResource("fileWrite.txt");
        String content = new String(Files.readString(Paths.get(path.toURI())));


        assertEquals(content, textCheck);



    }
}
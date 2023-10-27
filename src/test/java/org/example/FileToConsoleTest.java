package org.example;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Scanner;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FileToConsoleTest {
    Scanner mockScanner = mock(Scanner.class);

    @Test
    public void givenSystemOutRule_whenInvokePrintln_thenLogSuccess() throws Exception {
        String fileOutput = "Loremipsumdolorsitamet,consecteturadipiscingelit,seddoeiusmodtemporincididuntutlaboreetdoloremagnaaliqua.Utenimadminimveniam,quisnostrudexercitationullamcolaborisnisiutaliquipexeacommodoconsequat.Duisauteiruredolorinreprehenderitinvoluptatevelitessecillumdoloreeufugiatnullapariatur.Excepteursintoccaecatcupidatatnonproident,suntinculpaquiofficiadeseruntmollitanimidestlaborum.";
        new FileIn(mockScanner);
        when(mockScanner.nextLine()).thenReturn("file.txt");
        InputStream is = FileIn.getFileFromResourceAsStream(FileIn.getFileName());

        String text = tapSystemOut(() -> {
            HandleOption.printInputStream(is, FileToConsole.class);
        });
        Assert.assertEquals(fileOutput, text.trim());
    }

    @Test
    void printFile() {
        String fileOutput = "Loremipsumdolorsitamet,consecteturadipiscingelit,seddoeiusmodtemporincididuntutlaboreetdoloremagnaaliqua.Utenimadminimveniam,quisnostrudexercitationullamcolaborisnisiutaliquipexeacommodoconsequat.Duisauteiruredolorinreprehenderitinvoluptatevelitessecillumdoloreeufugiatnullapariatur.Excepteursintoccaecatcupidatatnonproident,suntinculpaquiofficiadeseruntmollitanimidestlaborum.";
        new FileIn(mockScanner);
        when(mockScanner.nextLine()).thenReturn("file.txt");
        InputStream is = FileIn.getFileFromResourceAsStream(FileIn.getFileName());
        HandleOption.printInputStream(is, FileToConsole.class);
        assertEquals(fileOutput, FileToConsole.text);


    }


}
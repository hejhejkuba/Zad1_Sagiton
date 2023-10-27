package org.example;


import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.internal.stubbing.answers.ThrowsException;


import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class MainTest {
    Scanner mockScanner = mock(Scanner.class);
    @Test
    void main() throws Exception {
        new FileIn(mockScanner);
        when(mockScanner.nextLine()).thenReturn("file.txt");
        String[] args = null;
        Main.main(null);
    }
}
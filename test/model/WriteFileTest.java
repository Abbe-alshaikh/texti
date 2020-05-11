package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.io.IOException;
import java.io.PrintStream;

class WriteFileTest {
    WriteFile wf = new WriteFile();
    JTextPane ta;

    @BeforeEach
    void setUp() {
        ta = new JTextPane();
    }

    @AfterEach
    void tearDown() {
        ta = null;
        PrintStream originalOut = System.out;
        System.setOut(originalOut);
    }

    @Test
    void save() throws IOException {
    }
}
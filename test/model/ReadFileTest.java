package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileTest {
    ReadFile rf;

    @BeforeEach
    void setUp() {
    rf = new ReadFile();
    }

    @AfterEach
    void tearDown() {
    rf = null;
    }

    @Test
    void openNewFile() {
        JTextPane tp;
        tp = rf.openNewFile();
        assertNotNull(tp);
    }

    @Test
    void doOpen() throws IOException, ClassNotFoundException {
    }
}
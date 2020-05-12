package controller;

import integration.ImgHandler;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import javax.swing.text.StyleConstants;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TextiControllerTest {

private TextiController contr;
private JTextPane ta;

    @BeforeEach
    void setUp() {
         contr = new TextiController(new ImgHandler());
         ta = new JTextPane();
         contr.fontm.setTextPane(ta);
    }

    @AfterEach
    void tearDown() {

        contr = null;
        ta=null;
    }

    @Test
    void bold() {
        contr.bold();
        boolean expectedIsBoldBoolean = true;
        boolean returnedIsBoolean = StyleConstants.isBold(contr.fontm.getAttributeSet());
        assertEquals(expectedIsBoldBoolean,
                returnedIsBoolean);

    }
    @Test
    void cursive() {
        contr.cursive();
        boolean expectedIsCursiveBoolean = true;
        boolean returnedIsBoolean = StyleConstants.isItalic(contr.fontm.getAttributeSet());
        assertEquals(expectedIsCursiveBoolean,returnedIsBoolean);

    }

    @Test
    void setFont() {
        String expectedFontName = "Monospaced";
        StyleConstants.setForeground(contr.fontm.getAttributeSet(), Color.red);
        StyleConstants.setFontFamily(contr.fontm.getAttributeSet(), expectedFontName );
        String resultFontName = StyleConstants.getFontFamily(contr.fontm.getAttributeSet());
        assertEquals(expectedFontName, resultFontName);
    }
    @Test
    void setColor() {
        String testColor = "Blue";
        Color expectedColor= Color.BLUE;
        contr.setColor(testColor);
        Color returnedColor =contr.fontm.getColor();
        assertEquals(expectedColor, returnedColor);
    }
    @Test
    void insertImg() {
        JTextPane ta = new JTextPane();
        ByteArrayOutputStream printoutBuffer = new ByteArrayOutputStream();
        PrintStream inMemSysOut = new PrintStream(printoutBuffer);
        PrintStream originalPS=System.out;
        System.setOut(inMemSysOut);
        contr.insertImg(ta);

        String printout = printoutBuffer.toString();
        String expectedString="c:";
        assertTrue(printout.contains(expectedString), "uh-oh, something went horribly wrong...");

        System.setOut(originalPS);

    }
    //end of FT's tests

    @Test
    void openNewFile() {
    }


    @Test
    void doSave() {
    }

    @Test
    void export() {
    }

    @Test
    void doOpen() {
    }


    @Test
    void createList() {
    }

    @Test
    void setSize() {
    }

    @Test
    void highlighting() {
    }

    @Test
    void copy() {
    }

    @Test
    void doUnderline() {
    }

    @Test
    void help() {
    }

    @Test
    void setAlignment() {
    }

    @Test
    void paste() {
    }

    @Test
    void cut() {
    }
}
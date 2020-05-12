package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import javax.swing.text.Caret;
import javax.swing.text.StyleConstants;

import static org.junit.jupiter.api.Assertions.*;

class FontManagementTest {
 private JTextPane ta;
 private FontManagement fontManagement;

    @BeforeEach
    void instantiate(){
        ta = new JTextPane();
        fontManagement= new FontManagement();
        fontManagement.setTextPane(ta);

    }
    @AfterEach
    void reset(){
        ta = null;
        fontManagement = null;
    }


    @Test
    void getSelectedText() {
        String expectedString= null;
        String returnedString="this should be null";

       try {
             returnedString=fontManagement.getSelectedText();
        assertEquals(expectedString, returnedString);

        }catch(NullPointerException e){
            e.printStackTrace();
        }

    }

    @Test
    void bold() {
        boolean expectedIsBoldBoolean = true;
        fontManagement.bold();
        boolean returnedIsBoolean = StyleConstants.isBold(fontManagement.getAttributeSet());
        assertEquals(expectedIsBoldBoolean,returnedIsBoolean);
    }

    @Test
    void cursive() {
    }

    @Test
    void setFont() {
    }

    @Test
    void setColor() {
    }
}
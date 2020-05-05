package model;

import javax.swing.*;
import javax.swing.text.Caret;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;

public class FontManagement {
    JTextPane ta;
Font font = new Font(null);
    int mode=0;
    Color color = Color.BLACK;
    MutableAttributeSet attributeSet= new SimpleAttributeSet();

    public String getSelectedText () {

        Caret caret = ta.getCaret();
        if (caret == null) {
            // No caret => no selected text
            return null;
        }
        String s = ta.getSelectedText ();
        if (s == null) {
            return null;
        }

        return s;
    }


    public void setTextPane(JTextPane ta){
        this.ta=ta;
    }
    public void bold(){

        Boolean m = StyleConstants.isBold(attributeSet);
        StyleConstants.setBold(attributeSet, !m);
        System.out.println(m);
        ta.setCharacterAttributes(attributeSet, true);

    }

    public void cursive(){

        Boolean m = StyleConstants.isItalic(attributeSet);
        StyleConstants.setItalic(attributeSet, !m);
        System.out.println(m);
        ta.setCharacterAttributes(attributeSet, true);
    }
    public void size(int sz){
        StyleConstants.setFontSize(attributeSet, sz);
        ta.setCharacterAttributes(attributeSet, true);
    }

    //managing the different font-options
    public void setFont(String fontname){

        StyleConstants.setForeground(attributeSet, color);
        StyleConstants.setFontFamily(attributeSet, fontname );
        ta.setCharacterAttributes(attributeSet, true);
    }
    public void setColor(String selectedColor){
        if(selectedColor.equals("Red")){
            color = Color.RED;
        } if(selectedColor.equals("Blue")){
            color = Color.BLUE;
        } if(selectedColor.equals("Green")){
            color = Color.GREEN;
        } if(selectedColor.equals("Purpdle")){
            color = Color.MAGENTA;
        } if(selectedColor.equals("Orange")){
            color = Color.ORANGE;
        } if(selectedColor.equals("Black")){
            color = Color.BLACK;
        }if(selectedColor.equals("Yellow")) {
            color = Color.YELLOW;
        }
        setForegroundColor();
    }
    private void setForegroundColor(){
        StyleConstants.setForeground(attributeSet, color);
        ta.setCharacterAttributes(attributeSet, true);
        System.out.println("in fgcolor");
    }

    public void doUnderline() {

        Boolean m = StyleConstants.isUnderline(attributeSet);
        StyleConstants.setUnderline(attributeSet, !m);
        ta.setCharacterAttributes(attributeSet, true);
    }

}

package model;
import java.util.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

public class FontManagement {
    JTextPane ta;
Font font = new Font(null);
    int mode=0;
    Color color;

    SimpleAttributeSet attributeSet = new SimpleAttributeSet();

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

       /* if (ta.getFont().getStyle() == Font.BOLD){ //bold = 1
            //  plain = new Font(ta.getFont().getName(), Font.PLAIN, ta.getFont().getSize());
            // ta.setFont(plain);
            doPlain();
        }else if(ta.getFont().getStyle() == 3) {
           doPlain();
        }else{
            doBold();
        }
        */
        Boolean m = StyleConstants.isBold(attributeSet);
        StyleConstants.setBold(attributeSet, !m);
        System.out.println(m);
        ta.setCharacterAttributes(attributeSet, true);

    }

    private void doBold(){

        mode += Font.BOLD;
        font = new Font(ta.getFont().getName(), mode, ta.getFont().getSize());
        ta.setFont(font);
        System.out.println("mode, dobold" + mode);
        
    }
    //bold = 1
    //cursive = 2
    //bold + cursive = 3

    private void doPlain(){

        mode -= Font.BOLD;
        font = new Font(ta.getFont().getName(), mode, ta.getFont().getSize());
        ta.setFont(font);
        System.out.println("mode, doplain" + mode);
    }
    public void cursive(){
        if(ta.getFont().getStyle() == Font.ITALIC){

            mode -=Font.ITALIC;
            font = new Font(ta.getFont().getName(), mode , ta.getFont().getSize());
            ta.setFont(font);
            System.out.println("mode, ITALIC"+ mode);
        }else if(ta.getFont().getStyle() == 3){

            mode -= Font.ITALIC;
            font = new Font(ta.getFont().getName(), mode , ta.getFont().getSize());
            ta.setFont(font);
            System.out.println("mode, italics else" + mode);
        }else{

            mode += Font.ITALIC;
            font = new Font(ta.getFont().getName(), mode , ta.getFont().getSize());
            ta.setFont(font);
            System.out.println("mode, italics else" + mode);
        }
        System.out.println(ta.getFont().getStyle());
        Boolean m = StyleConstants.isItalic(attributeSet);
        StyleConstants.setItalic(attributeSet, !m);
        System.out.println(m);
        ta.setCharacterAttributes(attributeSet, true);
    }
    public void size(int sz){
        font = new Font(ta.getFont().getName(),ta.getFont().getStyle(), sz );
        ta.setFont(font);
    }

    //managing the different font-options
    public void setFont(String fontname){
        /* font = new Font(fontname, mode, ta.getFont().getSize());
        ta.setFont(font);
        System.out.println(ta.getFont().getStyle());
        */

        MutableAttributeSet newFont = new SimpleAttributeSet();
        StyleConstants.setForeground(newFont, Color.black);
        StyleConstants.setFontFamily(newFont, fontname );
        ta.setCharacterAttributes(newFont, true);
    }
    public void setColor(String selectedColor){
        if(selectedColor.equals("Red")){
            color = Color.RED;
        } if(selectedColor.equals("Blue")){
            color = Color.BLUE;
        } if(selectedColor.equals("Green")){
            color = Color.GREEN;
        } if(selectedColor.equals("Purple")){
            color = Color.MAGENTA;
        } if(selectedColor.equals("Orange")){
            color = Color.ORANGE;
        } if(selectedColor.equals("Black")){
            color = Color.BLACK;
        }if(selectedColor.equals("Yellow")) {
            color = Color.YELLOW;
        }
    }
    public Color getColor(){
        return color;
    }
}

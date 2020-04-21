package model;
import java.util.*;
import javax.swing.*;
import java.awt.*;


public class FontManagement {
Font font = new Font(null);
    int mode=0;
    public void bold(JTextArea ta){
        if (ta.getFont().getStyle() == Font.BOLD){ //bold = 1
            //  plain = new Font(ta.getFont().getName(), Font.PLAIN, ta.getFont().getSize());
            // ta.setFont(plain);
            doPlain(ta);
        }else if(ta.getFont().getStyle() == 3) {
           doPlain(ta);
        }else{
            doBold(ta);
        }
    }

    private void doBold(JTextArea ta){

        mode += Font.BOLD;
        font = new Font(ta.getFont().getName(), mode, ta.getFont().getSize());
        ta.setFont(font);
        System.out.println("mode, dobold" + mode);
        
    }
    //bold = 1
    //cursive = 2
    //bold + cursive = 3

    private void doPlain( JTextArea ta){

        mode -= Font.BOLD;
        font = new Font(ta.getFont().getName(), mode, ta.getFont().getSize());
        ta.setFont(font);
        System.out.println("mode, doplain" + mode);
    }
    public void cursive(JTextArea ta){
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
    }
    public void size(int sz, JTextArea ta){
        font = new Font(ta.getFont().getName(),ta.getFont().getStyle(), sz );
        ta.setFont(font);
    }

    //managing the different font-options
    public void setFont(String fontname, JTextArea ta){
        font = new Font(fontname, mode, ta.getFont().getSize());
        ta.setFont(font);
    }
}

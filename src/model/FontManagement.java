package model;
import java.util.*;
import javax.swing.*;
import java.awt.*;


public class FontManagement {
Font font = new Font(null);
    int mode=0;
    public void doBold(JTextArea ta){
        System.out.println("mode, dobold" + mode);

        mode += Font.BOLD;
        font = new Font(ta.getFont().getName(), mode, ta.getFont().getSize());
        ta.setFont(font);
        
    }
    //bold = 1
    //cusive = 2
    //bold + cursive = 3

    public void doPlain( JTextArea ta){
        System.out.println("mode, doplain" + mode);
        mode -= Font.BOLD;
        font = new Font(ta.getFont().getName(), Font.PLAIN, ta.getFont().getSize());
        ta.setFont(font);
    }
    public void cursive(JTextArea ta){
        if(ta.getFont().getStyle() == (Font.ITALIC)){
            System.out.println("mode, ITALIC"+ mode);
            mode -=Font.ITALIC;
            font = new Font(ta.getFont().getName(), mode , ta.getFont().getSize());
        }else if(ta.getFont().getStyle() == 3){
            System.out.println("mode, italics else" + mode);
            mode -= Font.ITALIC;
            font = new Font(ta.getFont().getName(), mode , ta.getFont().getSize());
            ta.setFont(font);
        }else{
            System.out.println("mode, italics else" + mode);
            mode += Font.ITALIC;
            font = new Font(ta.getFont().getName(), mode , ta.getFont().getSize());
            ta.setFont(font);
        }
    }
}

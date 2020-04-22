package model;
import java.util.*;
import javax.swing.*;
import java.awt.*;


public class FontManagement {
    JTextPane ta;
Font font = new Font(null);
    int mode=0;
    Color color;



    public void setTextPane(JTextPane ta){
        this.ta=ta;
    }
    public void bold(){
        if (ta.getFont().getStyle() == Font.BOLD){ //bold = 1
            //  plain = new Font(ta.getFont().getName(), Font.PLAIN, ta.getFont().getSize());
            // ta.setFont(plain);
            doPlain();
        }else if(ta.getFont().getStyle() == 3) {
           doPlain();
        }else{
            doBold();
        }
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
    }
    public void size(int sz){
        font = new Font(ta.getFont().getName(),ta.getFont().getStyle(), sz );
        ta.setFont(font);
    }

    //managing the different font-options
    public void setFont(String fontname){
        font = new Font(fontname, mode, ta.getFont().getSize());
        ta.setFont(font);
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

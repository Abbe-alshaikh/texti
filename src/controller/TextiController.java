package controller;
import javax.swing.*;
import java.awt.*;
import model.*;

public class TextiController extends JFrame {
    JTextPane ta;
    OpenFile o = new OpenFile();
    FontManagement fontm= new FontManagement();
    //vi flyttar skapandet av ta till modellen och det returneras här tbx till vyn
    public JTextPane openNewFile(){
        ta = o.openNewFile();
        fontm.setTextPane(ta);
        return ta;
    }

    public void bold(){
        fontm.bold();
    }
    public void cursive(){

        fontm.cursive();
    }
    //controlling fonts
    public void setFont(String font){
        fontm.setFont(font);
    }


    public void doSave(){
        SaveFile sf = new SaveFile();
        sf.doSave(ta);
    }
    public void setColor(String color){
        fontm.setColor(color);
        ta.setForeground(fontm.getColor());
    }
    public void doOpen(){
        o.doOpen(ta);
    }

    public void setSize(int size){
        fontm.size(size);

    }

}
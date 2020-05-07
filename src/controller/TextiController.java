package controller;
import model.FontManagement;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

import model.*;

public class TextiController extends JFrame {
    JTextPane ta;
    ReadFile o = new ReadFile();
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

    public void doSave(JTextPane ta) throws IOException, ClassNotFoundException {
        WriteFile wf = new WriteFile();
        wf.save(ta);
    }
    public JTextPane doOpen() throws IOException, ClassNotFoundException {
        ta = o.doOpen();
        fontm.setTextPane(ta);
        return ta;
    }
    public void setColor(String color){
        fontm.setColor(color);
       // ta.setForeground(fontm.getColor());
    }
    public void setSize(int size){
        fontm.size(size);
    }
    public void doUnderline(){
        fontm.doUnderline();
    }

    public void setAlignment(String placement) {
        fontm.setAlignment(placement);
    }
}
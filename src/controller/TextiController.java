package controller;
import javax.swing.*;
import java.awt.*;
import model.*;

public class TextiController extends JFrame {
    JTextPane textArea;
    OpenFile o = new OpenFile();
    FontManagement fontm= new FontManagement();
    //vi flyttar skapandet av ta till modellen och det returneras här tbx till vyn
    public JTextPane openNewFile(){
        textArea = o.openNewFile();
        return textArea;
    }

    public void bold(JTextPane ta){
        fontm.bold(ta);
    }
    public void cursive(JTextPane ta){

        fontm.cursive(ta);
    }
    //controlling fonts
    public void setFont(String font, JTextPane ta){
        fontm.setFont(font, ta);
    }


    public void doSave(JTextPane ta){
        SaveFile sf = new SaveFile();
        sf.doSave(ta);
    }
    public void doOpen(JTextPane ta){
        o.doOpen(ta);
    }

    public void setSize(int size, JTextPane ta){
        fontm.size(size, ta);
    }

}
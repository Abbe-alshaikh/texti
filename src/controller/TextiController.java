package controller;
import javax.swing.*;
import java.awt.*;
import model.*;

public class TextiController extends JFrame {
    JTextArea textArea;
    OpenFile o = new OpenFile();
    FontManagement fontm= new FontManagement();
    //vi flyttar skapandet av ta till modellen och det returneras här tbx till vyn
    public JTextArea openNewFile(){
        textArea = o.openNewFile();
        return textArea;
    }

    public void bold(JTextArea ta){
        fontm.bold(ta);
    }
    public void cursive(JTextArea ta){

        fontm.cursive(ta);
    }
    //controlling fonts
    public void setFont(String font, JTextArea ta){
        fontm.setFont(font, ta);
    }


    public void doSave(JTextArea ta){
        SaveFile sf = new SaveFile();
        sf.doSave(ta);
    }
    public void doOpen(JTextArea ta){
        o.doOpen(ta);
    }

    public void setSize(int size, JTextArea ta){
        fontm.size(size, ta);
    }

}
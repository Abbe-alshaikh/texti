package controller;
import javax.swing.*;
import java.awt.*;
import model.*;

public class TextiController extends JFrame {
    JTextArea textArea;
    FontManagement fontm= new FontManagement();
    //vi flyttar skapandet av ta till modellen och det returneras här tbx till vyn
    public JTextArea openNewFile(){
        textArea = new JTextArea(1000,900);
        return textArea;
    }

    public void bold(JTextArea ta){
        if (ta.getFont().getStyle() == 1){ //bold = 1
            //  plain = new Font(ta.getFont().getName(), Font.PLAIN, ta.getFont().getSize());
            // ta.setFont(plain);
            fontm.doPlain(ta);
        }else {
            //normal: javax.swing.plaf.FontUIResource[family=Dialog,name=Dialog,style=plain,size=12]
            // bold = new Font(ta.getFont().getName(), Font.BOLD, ta.getFont().getSize());
            // ta.setFont(bold);
            fontm.doBold(ta);
            //Bold: java.awt.Font[family=Dialog,name=Dialog,style=bold,size=12]
        }
    }
    public void cursive(JTextArea ta){
        fontm.cursive(ta);
    }


    public void doSave(JTextArea ta){
        SaveFile sf = new SaveFile();
        sf.doSave(ta);
    }
    public void doOpen(JTextArea ta){
        OpenFile o = new OpenFile();
        o.doOpen(ta);
    }

}
package controller;
import javax.swing.*;
import java.awt.*;
import model.*;

public class TextiController extends JFrame {
    JTextArea textArea;
    public JTextArea openNewFile(){
        textArea = new JTextArea(1000,900);
        return textArea;
    }
    public void doPlain( JTextArea ta){
        Font  plain = new Font(ta.getFont().getName(), Font.PLAIN, ta.getFont().getSize());
        ta.setFont(plain);
    }
    public void doBold(JTextArea ta){
        Font bold = new Font(ta.getFont().getName(), Font.BOLD, ta.getFont().getSize());
        ta.setFont(bold);
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

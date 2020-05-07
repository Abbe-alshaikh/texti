package model;

import javax.swing.*;
import java.io.*;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
public class ReadFile {

    JTextPane ta;

    public JTextPane openNewFile(){
        return new JTextPane();
    }

    public JTextPane doOpen() throws IOException, ClassNotFoundException {
        JFileChooser chooser = new JFileChooser("c:");
        int r = chooser.showOpenDialog(null);
        File f = new File(chooser.getSelectedFile().getAbsolutePath());

        if(r == JFileChooser.APPROVE_OPTION) {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ta = (JTextPane) ois.readObject();
            ois.close();
        }
        System.out.println(ta.toString());
        return ta;
    }
}

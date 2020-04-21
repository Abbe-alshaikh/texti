package model;
///import controller.TextiController;

import javax.swing.*;
import java.io.*;


public class OpenFile {
    public JTextPane openNewFile(){
        JTextPane textArea = new JTextPane();
        return textArea;
    }
    public void doOpen(JTextPane ta){


        // Create an object of JFileChooser class
        JFileChooser j = new JFileChooser("f:");

        // Invoke the showsOpenDialog function to show the save dialog
        int r = j.showOpenDialog(null);

        // If the user selects a file
        if (r == JFileChooser.APPROVE_OPTION) {
            // Set the label to the path of the selected directory
            File fi = new File(j.getSelectedFile().getAbsolutePath());

            try {
                // String
                String s1 = "", sl = "";

                // File reader
                FileReader fr = new FileReader(fi);

                // Buffered reader
                BufferedReader br = new BufferedReader(fr);

                // Initilize sl
                sl = br.readLine();

                // Take the input from the file
                while ((s1 = br.readLine()) != null) {
                    sl = sl + "\n" + s1;
                }

                // Set the text
                ta.setText(sl);
            }
            catch (Exception evt) {
                ///JOptionPane.showMessageDialog(f, evt.getMessage());
            }
        }
        // If the user cancelled the operation
        ///else
           /// JOptionPane.showMessageDialog(f, "the user cancelled the operation");
    }
}



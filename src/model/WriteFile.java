package model;

import javax.swing.*;
import java.io.*;

public class WriteFile {
    String formattedText;

    public void save(JTextPane ta) throws IOException {
        if(ta.getText().length() > 0){
            JFileChooser chooser = new JFileChooser();
            chooser.setMultiSelectionEnabled(true);
            //FileNameExtensionFilter filter = new FileNameExtensionFilter("RICH TEXT FORMAT", "rtf", "rtf");
            //chooser.setFileFilter(filter);

            int option = chooser.showSaveDialog(null);
            String filePath = chooser.getSelectedFile().getPath();

            if(option == JFileChooser.APPROVE_OPTION){
                FileOutputStream fos = new FileOutputStream(filePath);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(ta);
                oos.flush();
                oos.close();

            } else {
                System.out.println("Save cancelled.");
            }
        }
    }
}

package model;

import javax.swing.*;
import java.awt.*;
import java.awt.print.*;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class PrintFile{

    public void printSetup(JTextPane ta){
        //PrinterJob job = PrinterJob.getPrinterJob();
        //job.setPrintable(ta.getPrintable(null,null));
        try { ta.setContentType("text/rtf");
        //boolean ok = job.printDialog();
        boolean done = ta.print();
         if (done) {
             JOptionPane.showMessageDialog(null, "Printing done");
         }else {
             JOptionPane.showMessageDialog(null, "Printing failed");
         }
             //job.print();
         }catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, "Error while printing");
        }
    }




   /* @Override
    public int print(Graphics g, PageFormat pf, int pageIndex) throws PrinterException {

        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
        return 0;
    }  */
}

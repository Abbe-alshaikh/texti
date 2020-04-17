package startup;

import controller.TextiController;

import view.*;

import javax.swing.*;

public class Startup {
    public static void main(String args[]){
       // JFrame frame = new JFrame("wordrocessor, Texti");
      TextiController contr = new TextiController();
      RenderView rv = new RenderView(contr);
     /* frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(rv);
      frame.pack();
      frame.setVisible(true); */

    }
}


package startup;

import controller.TextiController;

import view.*;

import javax.swing.*;
import java.awt.*;

public class Startup {
    public static void main(String args[]){
       // JFrame frame = new JFrame("wordrocessor, Texti");
     TextiController contr = new TextiController();
      RenderView rv = new RenderView(contr);

      //something to look into
      /* frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(rv);
      frame.pack();
      frame.setVisible(true); */
   /*     String fonts[] =
                GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for ( int i = 0; i < fonts.length; i++ )
        {
            System.out.println(fonts[i]);
        }

    */
    }
}


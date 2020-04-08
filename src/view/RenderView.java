package view;
import controller.TextiController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RenderView extends JFrame implements ActionListener {
    private JScrollPane scrollbar;
    private int width = 1200, height = 900;
    private JMenuBar mb;
    TextiController contr;
    JTextArea ta;
    Font bold, plain;
    public RenderView(TextiController contr){
        this.contr=contr;
       Menu menu = new Menu(contr);
      userInterface(menu);
      //menu.setVisible(true);

    }
    private void userInterface(Menu menu){

        mb = menu.getMB();
        menu.newItem.addActionListener(this);
        menu.doBold.addActionListener(this);
        this.setTitle("Texti - the worlds best word processor!");
        //this.iconImage
        this.setSize(width, height);
        this.setLocation(0,0);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // this.add(scrollbar);
        this.setJMenuBar(mb);
        this.show();
    }

    //void renderTV(tv){
        //render textview
    //}
    public void actionPerformed(ActionEvent e){
        String action = e.getActionCommand();
        System.out.println(action);
        if(action.equals("New")){
            ta = contr.openNewFile();
             scrollbar = new JScrollPane(ta);
             this.add(ta);
             ta.setText("");
             this.show();
        }else if(action.equals("Bold")){
           if (ta.getFont().getStyle() == 1){ //bold = 1
             //  plain = new Font(ta.getFont().getName(), Font.PLAIN, ta.getFont().getSize());
              // ta.setFont(plain);
               contr.doPlain(ta);
           }else {
               //normal: javax.swing.plaf.FontUIResource[family=Dialog,name=Dialog,style=plain,size=12]
              // bold = new Font(ta.getFont().getName(), Font.BOLD, ta.getFont().getSize());
              // ta.setFont(bold);
               contr.doBold(ta);
               //Bold: java.awt.Font[family=Dialog,name=Dialog,style=bold,size=12]
           }
        }

    }

}
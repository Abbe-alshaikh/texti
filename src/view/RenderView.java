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
        menu.saveItem.addActionListener(this);
        menu.openItem.addActionListener(this);
        menu.cursive.addActionListener(this);
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
             /*ta = contr.openNewFile();
             scrollbar = new JScrollPane(ta);
             this.add(ta);
             ta.setText("");
             this.show();*/
             ta = newTA();
        }else if(action.equals("Bold")){
         contr.bold(ta);
        }else if(action.equals("Save")) {
            contr.doSave(ta);
        }else if(action.equals("Open")) {
            /*ta = contr.openNewFile();
            scrollbar = new JScrollPane(ta);
            this.add(ta);
            ta.setText("");
            this.show();*/
            ta = newTA();
            contr.doOpen(ta);
        }else if(action.equals("Cursive")){
            contr.cursive(ta);
        }

    }
    public JTextArea newTA(){
        ta = contr.openNewFile();
        scrollbar = new JScrollPane((ta));
        this.add(ta);
        ta.setText("");
        this.show();
        return ta;
    }

}
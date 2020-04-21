package view;
import controller.TextiController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RenderView extends JFrame implements ActionListener {
    private JScrollPane scrollbar;
    private int width = 1200, height = 900;
    private JMenuBar mb;
    private String fName;
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
        menu.s8.addActionListener(this);
        menu.s10.addActionListener(this);
        menu.s12.addActionListener(this);
        menu.s14.addActionListener(this);
        menu.s16.addActionListener(this);
        menu.s18.addActionListener(this);
        menu.s20.addActionListener(this);
        this.setTitle("Texti - the worlds best word processor!");
        //this.iconImage
        this.setSize(width, height);
        this.setLocation(0,0);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // this.add(scrollbar);
        this.setJMenuBar(mb);
        //add action listeners
        menu.newItem.addActionListener(this);
        menu.doBold.addActionListener(this);
        menu.saveItem.addActionListener(this);
        menu.openItem.addActionListener(this);
        menu.cursive.addActionListener(this);
        //Fonts action Listeners:
        menu.serif.addActionListener(this);
        menu.cantarell.addActionListener(this);
        menu.monospaced.addActionListener(this);
        menu.sansserif.addActionListener(this);
        this.show();
    }

    //void renderTV(tv){
        //render textview
    //}
    public void actionPerformed(ActionEvent e){
        String action = e.getActionCommand();
        if(action.equals("New")){
             ta = newTA();
        }else if(action.equals("Bold")){
         contr.bold(ta);
        }else if(action.equals("Save")) {
            contr.doSave(ta);
        }else if(action.equals("Open")) {
            ta = newTA();
            contr.doOpen(ta);
        }else if(action.equals("Cursive")){
            contr.cursive(ta);
        }else if(action.equals("Serif")){
            fName= "Serif".toString();
            contr.setFont(fName, ta);
        }else if(action.equals("Monospaced")){
            fName= "Monospaced".toString();
            contr.setFont(fName, ta);
        }else if(action.equals("SansSerif")){
             fName= "SansSerif".toString();
            contr.setFont(fName, ta);
        }else if(action.equals("Cantarell")){
            fName= "Cantarell".toString();
            contr.setFont(fName, ta);
        }
        else if(action.equals("8")){
            contr.setSize(8,ta);
        }
        else if(action.equals("10")){
            contr.setSize(10,ta);
        }
        else if(action.equals("12")){
            contr.setSize(12,ta);
        }
        else if(action.equals("14")){
            contr.setSize(14,ta);
        }
        else if(action.equals("16")){
            contr.setSize(16,ta);
        }
        else if(action.equals("18")){
            contr.setSize(18,ta);
        }
        else if(action.equals("20")){
            contr.setSize(20,ta);
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
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
    Menu menu;
    JTextPane ta;
    Font bold, plain;
    public RenderView(TextiController contr){
        this.contr=contr;
        menu = new Menu(contr);
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

        //Fonts action Listeners:
        menu.serif.addActionListener(this);
        menu.cantarell.addActionListener(this);
        menu.monospaced.addActionListener(this);
        menu.sansserif.addActionListener(this);
        //colors action-listener
        menu.colors.addActionListener(this);
        //menu.colors.setPrototypeDisplayValue("Orange");

        this.setTitle("Texti - the worlds best word processor!");
        //this.iconImage

        this.setLocation(0,0);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // this.add(scrollbar);
        this.setJMenuBar(mb);
        this.pack();
        this.setVisible(true);
        this.setBounds(10,10,width,height);
        //this.show();

    }

    //void renderTV(tv){
        //render textview
    //}
    public void actionPerformed(ActionEvent e){
        String action = e.getActionCommand();

        if(action.equals("New")){
             newTA();
        }else if(action.equals("Bold")){
         contr.bold();
        }else if(action.equals("Save")) {
            contr.doSave();
        }else if(action.equals("Open")) {
             newTA();
            contr.doOpen();
        }else if(action.equals("Cursive")){
            contr.cursive();
        }else if(action.equals("Serif")){
            fName= "Serif".toString();
            contr.setFont(fName);
        }else if(action.equals("Monospaced")){
            fName= "Monospaced".toString();
            contr.setFont(fName);
        }else if(action.equals("SansSerif")){
             fName= "SansSerif".toString();
            contr.setFont(fName);
        }else if(action.equals("Cantarell")){
            fName= "Cantarell".toString();
            contr.setFont(fName);
        }
        else if(action.equals("8")){
            contr.setSize(8);
        }
        else if(action.equals("10")){
            contr.setSize(10);
        }
        else if(action.equals("12")){
            contr.setSize(12);
        }
        else if(action.equals("14")){
            contr.setSize(14);
        }
        else if(action.equals("16")){
            contr.setSize(16);
        }
        else if(action.equals("18")){
            contr.setSize(18);
        }
        else if(action.equals("20")){
            contr.setSize(20);
        } else if(e.getSource()==menu.colors){
            System.out.println("listening in colors");
            contr.setColor(menu.colors.getSelectedItem().toString());
        }

    }
    public void newTA(){
        ta = contr.openNewFile();
        scrollbar = new JScrollPane((ta));
        this.add(ta);
        ta.setText("");
        this.setVisible(true);

    }

}
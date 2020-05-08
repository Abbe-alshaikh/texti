package view;
import controller.TextiController;
import model.SidePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class RenderView extends JFrame implements ActionListener {
    private JScrollPane scrollbar;
    private int width = 1200, height = 900;
    private JMenuBar mb;
    private JPanel sp;
    private String fName;
    TextiController contr;
    Menu menu;
    SidePanel sidePanel;
    JTextPane ta;
    Font bold, plain;
    public RenderView(TextiController contr){
        this.contr=contr;
        menu = new Menu(contr);
        sidePanel = new SidePanel(contr);
      userInterface(menu, sidePanel);
      //menu.setVisible(true);

    }
    private void userInterface(Menu menu, SidePanel sidePanel){

        mb = menu.getMB();
        sp = sidePanel.getSidePanel();

        menu.newItem.addActionListener(this);
        menu.doBold.addActionListener(this);
        menu.underline.addActionListener(this);
        menu.saveItem.addActionListener(this);
        menu.openItem.addActionListener(this);
        menu.cursive.addActionListener(this);
        menu.export.addActionListener(this);
        //image,picture actionListener
        menu.picture.addActionListener(this);
        // Size action listeners
        menu.s8.addActionListener(this);
        menu.s10.addActionListener(this);
        menu.s12.addActionListener(this);
        menu.s14.addActionListener(this);
        menu.s16.addActionListener(this);
        menu.s18.addActionListener(this);
        menu.s20.addActionListener(this);

        // Alignment action listeners
        menu.left.addActionListener(this);
        menu.center.addActionListener(this);
        menu.right.addActionListener(this);

        //Fonts action Listeners:
        menu.serif.addActionListener(this);
        menu.cantarell.addActionListener(this);
        menu.monospaced.addActionListener(this);
        menu.sansserif.addActionListener(this);
        //colors action-listener
        menu.colors.addActionListener(this);
        //menu.colors.setPrototypeDisplayValue("Orange");

        //Action listeners for Side Panel
        sidePanel.bold.addActionListener(this);
        sidePanel.high.addActionListener(this);
        sidePanel.cursive.addActionListener(this);
        sidePanel.underline.addActionListener(this);
        sidePanel.help.addActionListener(this);

        this.setTitle("Texti - the worlds best word processor!");
        //this.iconImage

        this.setLocation(0,0);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // this.add(scrollbar);
        this.setJMenuBar(mb);
        this.add(sp, BorderLayout.BEFORE_LINE_BEGINS);
        this.pack();
        this.setVisible(true);
        this.setBounds(10,10,width,height);
        //this.show();

        //Lists
        menu.bullet_points.addActionListener(this);

        //initiate with a new text-area
        newTA();

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
            sidePanel.press(sidePanel.bold);
        }else if(action.equals("Save")) {
            try {
                contr.doSave(ta);
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }else if(action.equals("Open")) {
            try {
                this.ta = contr.doOpen();
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            scrollbar = new JScrollPane((ta));
            this.add(ta);
            this.setVisible(true);
        }else if (action.equals("Export to .rtf")) {
            contr.export(ta);
        }else if(action.equals("Cursive")){
            contr.cursive();
            sidePanel.press(sidePanel.cursive);
        }else if (action.equals("Underline")){
            contr.doUnderline();
            sidePanel.press(sidePanel.underline);
        } else if(action.equals("Serif")){
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
        }else if(action.equals("Bullet Points")){
            contr.createList();
            sidePanel.press(sidePanel.bulletList);
        }else if(action.equals("Insert Picture")){
            contr.insertImg(ta);
        }
        //Sidepanel
        else if (action.equals("B")){
            contr.bold();
            sidePanel.press(sidePanel.bold);
        }else if (action.equals("C")){
            contr.cursive();
            sidePanel.press(sidePanel.cursive);
        }else if (action.equals("U")){
            contr.doUnderline();
            sidePanel.press(sidePanel.underline);
        }else if (action.equals("H")){
            //contr.highLight();
            sidePanel.press(sidePanel.high);
        }else if (action.equals("*")){
            contr.createList();
            sidePanel.press(sidePanel.bulletList);
        }else if (action.equals("1.")){
            contr.insertImg(ta);
            sidePanel.press(sidePanel.numberedList);
        }else if (action.equals("Help")){
            contr.help();
        }
        //Allignment
        else if (action.equals("Left")){
            contr.setAlignment("left");
        }else if (action.equals("Center")){
            contr.setAlignment("center");
        }else if (action.equals("Right")){
            contr.setAlignment("right");
        }

    }
    public void newTA(){
        if(ta == null) {
            ta = contr.openNewFile();
            scrollbar = new JScrollPane((ta));
            this.add(ta);
            ta.setText("");
            this.setVisible(true);
        }else{
            ta.setText("");
        }
    }

}
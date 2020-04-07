package view;

import controller.Controller;

import javax.swing.*;
import java.awt.event.*;

public class Menu extends JFrame{
   private Controller contr;
    private JMenuBar menuBar;
    private JMenu menu, submenu;
    private JMenuItem menuItem;
    private JRadioButtonMenuItem rbMenuItem;
    private JCheckBoxMenuItem cbMenuItem;
    private JMenu  edit, view;
    private JMenuItem newItem, openItem, saveItem, exitItem, fontItem;


    public Menu(Controller contr){
      this.contr=contr;
      render();
    }
    private void render(){
       menu();
    }

    private void menu(){

       //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the scroll-down menus.
        menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        edit = new JMenu("Edit ");
        view= new JMenu("view ");
        menuBar.add(menu);
        menuBar.add(edit);
        menuBar.add(view);

        //add items to File scroll-down menu
        JMenuItem newItem0 = new JMenuItem("New");
        JMenuItem newItem1 = new JMenuItem("Open");
        JMenuItem newItem2 = new JMenuItem("Save");
        JMenuItem newItem3 = new JMenuItem("Save As..");
        menu.add(newItem0);
        menu.add(newItem1);
        menu.add(newItem2);
        menu.add(newItem3);

      /*  menuBar = new JMenuBar();
        fileMenu = new JMenu(" File ");
        editMenu = new JMenu("Edit ");
        viewMenu = new JMenu("View ");

        newMenuItem = new JMenuItem("New");
        fileMenu.add(newMenuItem);
        fileMenu.addSeparator();
        fileMenu.setMnemonic('f');

        openMenuItem = new JMenuItem("Open");

        fileMenu.add(openMenuItem);

        saveMenuItem = new JMenuItem("Save");
        fileMenu.add(saveMenuItem);

        fileMenu.addSeparator();
        exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);

        FontMenuItem = new JMenuItem("Font");
        editMenu.add(FontMenuItem);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);

        this.setJMenuBar(menuBar);

     */
    }
   //public void openFile(){
    //    TextView tv = contr.openFile();
     //   renderTv(tv);
    //}
    public JMenuBar getMB(){
        return menuBar;
    }


}
package view;

import controller.Controller;

import javax.swing.*;
import java.awt.event.*;

public class Menu extends JFrame{
   private Controller contr;
    private JMenuBar menuBar;
    private JMenuItem menuItem;
    private JRadioButtonMenuItem rbMenuItem;
    private JCheckBoxMenuItem cbMenuItem;
    //private JMenu view, toolWindow;
    //private JMenuItem newItem, openItem, saveItem, exitItem, fontItem;


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
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_A);
        file.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        JMenu edit = new JMenu("Edit");
        JMenu view = new JMenu("View");
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(view);

        //add items to File scroll-down menu
        JMenuItem newItem0 = new JMenuItem("New");
        JMenuItem newItem1 = new JMenuItem("Open");
        JMenuItem newItem2 = new JMenuItem("Save");
        JMenuItem newItem3 = new JMenuItem("Save As..");
        file.add(newItem0);
        file.add(newItem1);
        file.add(newItem2);
        file.add(newItem3);

        JMenuItem undo = new JMenuItem("Undo");
        JMenuItem redo = new JMenuItem("Redo");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        edit.add(undo);
        edit.add(redo);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        JMenuItem editWindow = new JMenuItem("Edit Window");
        JMenuItem fontWindow = new JMenuItem("Font Window");
        JMenu toolWindow = new JMenu("Tool Windows");
        view.add(toolWindow);
        toolWindow.add(editWindow);
        toolWindow.add(fontWindow);



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
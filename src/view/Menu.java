package view;


import controller.TextiController;

import javax.swing.*;
import java.awt.event.*;

public class Menu extends JFrame{
   private TextiController contr;
    private JMenuBar menuBar;
    private JMenuItem menuItem;
    private JRadioButtonMenuItem rbMenuItem;
    private JCheckBoxMenuItem cbMenuItem;
    private JMenu file, view, toolWindow, edit, insert, formatting, help, print, alignment, lists;
    private JMenuItem newItem, openItem, saveItem,saveAsItem,undo, redo, cut, copy, paste, spell_check,
            editWindow, fontWindow, picture, table, doBold, cursive, size_of_letters, underline,
            highlighting, left, center, right, bullet_points, enumeration, fonts ;

    public Menu(TextiController contr){
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
        file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_A);
        file.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        edit = new JMenu("Edit");
        view = new JMenu("View");
        insert = new JMenu("Insert");
        formatting = new JMenu("Text Formatting");
        help = new JMenu("Help");
        print = new JMenu("Print");


        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(view);
        menuBar.add(insert);
        menuBar.add(formatting);
        menuBar.add(help);
        menuBar.add(print);


        //add items to File scroll-down menu
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        saveAsItem = new JMenuItem("Save As..");
        file.add(newItem);
        file.add(openItem);
        file.add(saveItem);
        file.add(saveAsItem);

        undo = new JMenuItem("Undo");
        redo = new JMenuItem("Redo");
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        spell_check = new JMenuItem("Spell check");
        edit.add(undo);
        edit.add(redo);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(spell_check);

        editWindow = new JMenuItem("Edit Window");
        fontWindow = new JMenuItem("Font Window");
        toolWindow = new JMenu("Tool Windows");
        view.add(toolWindow);
        toolWindow.add(editWindow);
        toolWindow.add(fontWindow);

        picture = new JMenuItem("Insert Picture");
        insert.add(picture);
        table = new JMenuItem("Insert Table");
        insert.add(table);

        doBold = new JMenuItem("Bold");
        formatting.add(doBold);

        cursive = new JMenuItem("Cursive");
        formatting.add(cursive);

        size_of_letters = new JMenuItem("Size");
        formatting.add(size_of_letters);

        underline = new JMenuItem("Underline");
        formatting.add(underline);

        highlighting = new JMenuItem("Highlighting");
        formatting.add(highlighting);

        alignment = new JMenu ("Alignment ");
        formatting.add(alignment);
        left = new JMenuItem("Left ");
        center = new JMenuItem("Center ");
        right = new JMenuItem("Right ");
        alignment.add(left);
        alignment.add(center);
        alignment.add(right);

        lists = new JMenu ("Lists");
        bullet_points = new JMenuItem("Bullet Points");
        enumeration = new JMenuItem("Enumeration");
        formatting.add(lists);
        lists.add(bullet_points);
        lists.add(enumeration);

        fonts = new JMenuItem("Fonts");
        formatting.add(fonts);

    }
   //public void openFile(){
    //    TextView tv = contr.openFile();
     //   renderTv(tv);
    //}
    public JMenuBar getMB(){
        return menuBar;
    }


}
package View;


import javax.swing.*;
public class RenderView extends JFrame{
    //JTextArea textArea = new JTextArea(1000,900);
    private int width = 1200, height = 900;
    //private JScrollPane scrollbar = new JScrollPane(textArea);
    public RenderView(Controller.controller contr){

       Menu menu = new Menu(contr);
      userInterface(menu);
      //menu.setVisible(true);

    }
    private void userInterface(Menu mb){

        mb.getMenuBar();
        this.setTitle("Texti - the worlds best word processor!");
        //this.iconImage
        this.setSize(width, height);
        this.setLocation(0,0);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // this.add(scrollbar);
        this.setJMenuBar(mb.getMB());
    }

    //void renderTV(tv){
        //render textview
    //}
}
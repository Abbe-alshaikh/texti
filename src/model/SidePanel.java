package model;

import controller.TextiController;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import java.awt.*;

/**
 * This creates the sidepanel of the app
 */
public class SidePanel extends JFrame {
    private TextiController contr;
    private JPanel sidePanel, bottomPanel;
    public JButton bold, high, cursive, underline, help, bulletList, numberedList;


    /**
     * gives the sidePanel the controller
     * @param contr
     */
    public SidePanel(TextiController contr) {
        this.contr = contr;
        render();
    }

    private void render(){sidePanel();}

    private void sidePanel(){

        sidePanel = new JPanel();

        bold = new JButton("B");
        high = new JButton("H");
        cursive = new JButton("C");
        underline = new JButton("U");
        bulletList = new JButton("*");
        numberedList = new JButton("1.");

        bold.setFocusable(false);
        high.setFocusable(false);
        cursive.setFocusable(false);
        underline.setFocusable(false);

        //bold.getModel().isPressed();
        //bold.getModel().setPressed(true);

        bold.setFont(new Font("Dialog", Font.BOLD, 12));
        cursive.setFont(new Font(cursive.getFont().getName(),Font.ITALIC+Font.PLAIN,cursive.getFont().getSize()));
        Border lineBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK);
        CompoundBorder border = new CompoundBorder(underline.getBorder(), lineBorder);
        underline.setBorder( border );
        underline.setBorder(border);
        underline.setFont((new Font(cursive.getFont().getName(),Font.PLAIN,underline.getFont().getSize())));
        high.setForeground(Color.RED);

        sidePanel.add(bold);
        sidePanel.add(cursive);
        sidePanel.add(underline);
        sidePanel.add(high);
        sidePanel.add(bulletList);
        sidePanel.add(numberedList);

        help = new JButton("Help");
        sidePanel.add(help);

        sidePanel.setPreferredSize(new Dimension(100,40));

    }

    public void press(JButton button){
        System.out.println("Pressed: " + button.getModel().isPressed());
        if(button.getModel().isPressed()){
            System.out.println("1");
            button.getModel().setPressed(false);
        }
        else{
            System.out.println("2");
            button.getModel().setPressed(true);
            System.out.println("Pressed2: " + button.getModel().isPressed());
        }
    }

    /**
     *
     * @return sidePanel
     */
    public JPanel getSidePanel(){
        return sidePanel;
    }
}

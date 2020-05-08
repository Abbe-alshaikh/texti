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
    //private TextiController contr;
    private JPanel sidePanel;
    public JToggleButton bold, high, cursive, underline, bulletList, numberedList;
    public JButton help;



    /**
     * gives the sidePanel the controller
     * @param contr
     */
    public SidePanel(/*TextiController contr*/) {
        //this.contr = contr;
        render();
    }

    private void render(){sidePanel();}

    private void sidePanel(){

        sidePanel = new JPanel();

        //bold = new JButton("B");
        bold = new JToggleButton("B");
        high = new JToggleButton("H");
        cursive = new JToggleButton("C");
        underline = new JToggleButton("U");
        bulletList = new JToggleButton("*");
        numberedList = new JToggleButton("1.");

        bold.setFocusable(false);
        high.setFocusable(false);
        cursive.setFocusable(false);
        underline.setFocusable(false);
        bulletList.setFocusable(false);
        numberedList.setFocusable(false);

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

    public void press(JToggleButton button){
        if(button.getModel().isSelected()){
            button.getModel().setSelected(false);
        }
        else{
            button.getModel().setSelected(true);
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

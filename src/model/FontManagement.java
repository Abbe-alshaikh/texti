package model;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

public class FontManagement {
    JTextPane ta;
    Font font = new Font(null);
    int mode=0;

    Color color = Color.BLACK;
    private MutableAttributeSet attributeSet= new SimpleAttributeSet();
    Object tag = null;
    Highlighter.HighlightPainter redPaint =
            new DefaultHighlighter.DefaultHighlightPainter(Color.red);

    /**
     * Returns a String, a copy of test that the user selects/"marks" with the mouse
     * That text can be manipulated in different ways, it could be higlighted, set to bold etc.
     * We are making use of a caret object to get the start and end positions of the selected text.
     * If there is no text selected the caret will be set to null which is what will be returned.
     * @return string copy of text a user selects
     */
    public String getSelectedText () {
        Caret caret = ta.getCaret();
        if (caret == null) {
            return null;
        }
        String s = ta.getSelectedText();
        if (s == null) {
            return null;
        }
        return s;
    }


    public void setTextPane(JTextPane ta){

        this.ta=ta;
    }

    public void bold(){
        Boolean  m = StyleConstants.isBold(attributeSet);
        StyleConstants.setBold(attributeSet, !m);
        System.out.println(m);
        ta.setCharacterAttributes(attributeSet, true);
    }

    public void cursive(){
        Boolean m = StyleConstants.isItalic(attributeSet);
        StyleConstants.setItalic(attributeSet, !m);
        System.out.println(m);
        ta.setCharacterAttributes(attributeSet, true);
    }

    public void size(int sz){
        StyleConstants.setFontSize(attributeSet, sz);
        ta.setCharacterAttributes(attributeSet, true);
    }

    //managing the different font-options
    public void setFont(String fontname){

        StyleConstants.setForeground(attributeSet, color);
        StyleConstants.setFontFamily(attributeSet, fontname );
        ta.setCharacterAttributes(attributeSet, true);
    }
    public void setColor(String selectedColor){
        if(selectedColor.equals("Red")){
            color = Color.RED;
        } if(selectedColor.equals("Blue")){
            color = Color.BLUE;
        } if(selectedColor.equals("Green")){
            color = Color.GREEN;
        } if(selectedColor.equals("Purpdle")){
            color = Color.MAGENTA;
        } if(selectedColor.equals("Orange")){
            color = Color.ORANGE;
        } if(selectedColor.equals("Black")){
            color = Color.BLACK;
        }if(selectedColor.equals("Yellow")) {
            color = Color.YELLOW;
        }
        setForegroundColor();
    }
    private void setForegroundColor(){
        StyleConstants.setForeground(attributeSet, color);
        ta.setCharacterAttributes(attributeSet, true);
        System.out.println("in fgcolor");
    }

    public void doUnderline() {

        Boolean m = StyleConstants.isUnderline(attributeSet);
        StyleConstants.setUnderline(attributeSet, !m);
        ta.setCharacterAttributes(attributeSet, true);
    }

    public void setAlignment(String placement) {
        StyledDocument doc = ta.getStyledDocument();
        int plc=0;
        if (placement.equals("left")){
            plc=0;
        }else if (placement.equals("center")){
            plc=1;
        }else if (placement.equals("right")){
           plc=2;
        }
        String text = getSelectedText();
        int pos = ta.getCaretPosition();
        int pos2 = ta.getCaret().getMark();
        if (text == null) {
            StyleConstants.setAlignment(attributeSet, plc);
            ta.setCharacterAttributes(attributeSet, true);
            doc.setParagraphAttributes(pos, 1, attributeSet, false);
        }else{
            System.out.println(text);
            StyleConstants.setAlignment(attributeSet, plc);
            ta.setCharacterAttributes(attributeSet, true);
            if (pos>pos2) {
                doc.setParagraphAttributes(pos - text.length(), text.length(),
                                                            attributeSet, false);
            }else{
                doc.setParagraphAttributes(pos, text.length(), attributeSet, false);
            }
        }
    }
    public void createList(){
        int beginning=ta.getCaret().getDot();
        int end=ta.getCaret().getMark();
        StyledDocument doc = ta.getStyledDocument();
        TabStop[] tabs=new TabStop[1];
        tabs[0] =new TabStop(60, TabStop.ALIGN_RIGHT, TabStop.LEAD_NONE);
        TabSet tabSet= new TabSet(tabs);
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY,
                StyleConstants.TabSet, tabSet);
        ta.setParagraphAttributes(aset, false);
        String text = getSelectedText();
    }

    public void highlighting () {

            boolean highligtColor=StyleConstants.getBackground(attributeSet).equals(Color.RED);
            if (highligtColor){
                StyleConstants.setBackground(attributeSet, Color.white);
                ta.setCharacterAttributes(attributeSet, true);
                System.out.println("changed color");
            }else {
                StyleConstants.setBackground(attributeSet, Color.red);
                ta.setCharacterAttributes(attributeSet, true);
            }
        }

        public MutableAttributeSet getAttributeSet(){
        return attributeSet;
        }


    }


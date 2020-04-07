package startup;

import java.util.*;
import Controller.controller;

import View.*;
public class startup {
    public static void main(String args[]){
      controller contr = new controller();
      RenderView rv = new RenderView(contr);
      rv.setVisible(true);

    }
}
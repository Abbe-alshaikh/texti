package startup;

import controller.Controller;

import view.*;
public class Startup {
    public static void main(String args[]){
      Controller contr = new Controller();
      RenderView rv = new RenderView(contr);
      rv.setVisible(true);

    }
}
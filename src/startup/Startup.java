package startup;

import controller.TextiController;

import view.*;
public class Startup {
    public static void main(String args[]){
      TextiController contr = new TextiController();
      RenderView rv = new RenderView(contr);
      //rv.setVisible(true);

    }
}


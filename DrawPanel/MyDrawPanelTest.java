/*
 * To change this license header, choose License Headers in Project Properties.
 * KEEP CALM AND LOVE PROGRAMMING!!
 */

package PanelTest2;

import javax.swing.JFrame;

/**
 * @author GODSAVE PC
 */

public class MyDrawPanelTest {

    public static void main(String args []) {
        
         MyDrawPanel panel = new MyDrawPanel();
      
      // create a new frame to hold the panel
      JFrame application = new JFrame();
      
      // set the frame to exit when it is closed
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      application.add(panel); // add the panel to the frame      
      application.setSize(250, 250); // set the size of the frame
      application.setVisible(true); // make the frame visible 
    
    }
}

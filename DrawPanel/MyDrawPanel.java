/*
 * To change this license header, choose License Headers in Project Properties.
 * KEEP CALM AND LOVE PROGRAMMING!!
 */
package PanelTest2;

/**
 * @author GODSAVE PC
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int step = 0;
        int counter = 1;
        while (counter < 15) {
            g.drawLine(0, 0, step, height-step);
            g.drawLine(width, height, step, height-step);
            g.drawLine(0, height, width-step, height-step);
            g.drawLine(width, 0, width-step, height-step);
            step = step + 15;
            counter++;
        }
    }
}

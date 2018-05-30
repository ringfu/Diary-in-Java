package experiment.experiment7;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends Applet  {
    String msg = "";
    int mouseX = 0, mouseY = 0;
    public void init(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mouseX = 0;
                mouseY = 10;
                msg = "mouse entered";
                repaint();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                msg = "*";
                showStatus("mouse draging"+mouseX+","+mouseY);
                repaint();
            }
        });
    }

//    @Override
//    public void mouseClicked(MouseEvent e) {
//        mouseX = 0;
//        mouseY = 10;
//        msg = "mouse entered.";
//        repaint();
//    }
//
//    @Override
//    public void mousePressed(MouseEvent e) {
//        mouseX = e.getX();
//        mouseX = e.getY();
//        msg = "down";
//        repaint();
//    }
//
//    @Override
//    public void mouseReleased(MouseEvent e) {
//        mouseX = e.getX();
//        mouseY = e.getY();
//        msg = "up";
//        repaint();
//    }
//
//    @Override
//    public void mouseEntered(MouseEvent e) {
//        mouseX = 0;
//        mouseY = 10;
//        msg = "mouse entered.";
//        repaint();
//    }
//
//    @Override
//    public void mouseExited(MouseEvent e) {
//        mouseX = 0;
//        mouseY = 10;
//        msg = "mouse exit.";
//        repaint();
//    }
//
//    @Override
//    public void mouseDragged(MouseEvent e) {
//        mouseX = e.getX();
//        mouseY = e.getY();
//        msg = "*";
//        showStatus("deagging mouse at"+mouseX+","+mouseY);
//        repaint();
//    }
//
//    @Override
//    public void mouseMoved(MouseEvent e) {
//        showStatus("moving mouse at"+mouseX+","+mouseY);
//    }
    public void paint(Graphics g){
        g.drawString(msg,mouseX,mouseY);
    }
}

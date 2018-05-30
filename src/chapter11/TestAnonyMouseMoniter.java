package chapter11;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestAnonyMouseMoniter extends Frame{
    TextField texDisplay = new TextField(30);
    Label label = new Label("please enter the left click of the mouse");
    public TestAnonyMouseMoniter(){
        super("no name inner class test");
        add(label,"North");
        add(texDisplay,"South");
        addMouseListener(new MouseAdapter() {  //鼠标监听器，监听鼠标的移动，松开按下。。。
            @Override
            public void mouseDragged(MouseEvent e) {
                texDisplay.setText("mouse position: " + e.getPoint());
            }
        });
        setBackground(Color.CYAN);
        setSize(300,200);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestAnonyMouseMoniter();
    }
}

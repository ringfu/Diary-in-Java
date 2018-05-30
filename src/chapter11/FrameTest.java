package chapter11;

import java.awt.*;

/*
* 11.1 GuI 设计   page 209
* by：fy     time:2018-03-26*/
public class FrameTest {
    public static void main(String[] args) {
        Frame frame = new Frame("my first frame");
//        Label lable = new Label("this is my first frame");
        Panel panel = new Panel();
        Button button = new Button("ok");

//        frame.add(lable);
//        lable.setBackground(Color.cyan);
        frame.setLayout(null);
        frame.setLocation(0,0);
        frame.setSize(500,400);


        panel.setBackground(Color.GREEN);
        panel.setSize(100,50);
        panel.setLocation(20,20);

        frame.add(panel);

        button.setBackground(Color.WHITE);
        button.setLocation(50,100);
        button.setSize(20,10);
        panel.add(button);
        frame.setVisible(true);



    }
}

/*
* 笔记：
* 1，GUI：Graphical User Interface 图形用户界面
* 2，java.awt包： 提供基本GUI组件，视觉控制和绘图工具
*    java.awt.event包：提供java事件处理API
* 3，组件：凡是能在屏幕上显示并且能够与用户进行交互的对象均是组件
*    容器：能够包含其他awt组件的组件称为容器
* 4，容器可以是组件，但组件不一定是容器。控制组件必添加到容器组件中才可以显示
* 5，java.awt.Window： 顶层容器，一般使用其子类 Frame
*    java.awt.Panel: 最常用的的容器，不可独立存在，必须被添加到其他容器中（Frame）
* 6，一般的方法：
*   setBackground（Color color）
*   setLayout（type layout）
*   setLocation(int: x, int: y)
*   setSize（int: width, int: height）
*   setVisuable(true/false)
*    */
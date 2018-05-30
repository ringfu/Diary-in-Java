package chapter11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* 11.2 GUI事件处理  page 218
* by：fy     time：2018-03-26
* */
//监听器
class MyEventListener implements ActionListener{

    @Override
    //事件处理方法
    public void actionPerformed(ActionEvent e) {
        System.out.println("a button is cliked");
    }
}

public class EventTest {
    public static void main(String[] args) {
        Frame frame = new Frame("event test frame");
        frame.setLayout(new FlowLayout());
        frame.setBackground(Color.WHITE);
        frame.setLocation(100,100);
        frame.setSize(100,100);
        frame.setVisible(true);

        Button button = new Button("click me"); //事件源button， 事件：点击按钮
        frame.add(button);

        MyEventListener myEventListener = new MyEventListener();  //监听器对象
        button.addActionListener(myEventListener); //注册监听器对象

    }
}

/*
* 笔记：
* 1，GUI事件处理步骤：
*   1，定义事件监听器， 实现事件处理方法
*   2，实例化事件源（控制组件）， 实例化监听器对象
*   3，注册监听器 button.addActionListener(myEventListener)
*   4, 将组件放进容器
* 2，GUI事件层次：
*   java.lang.Object{java.util.EventObject}
*       java.util.EventObject{java.awt.AwtEvent}
*           java.awt.AwtEvent{ActionEvent, AdjustmentEvent,ComponentEvent,ItemEvent,TextEvent}
*
*   ComponentEvent{FocusEvent,InputEvent,ContainerEvent,WindowEvent}
*       InputEvent{KeyEvent,MouseEvent}
*   **/
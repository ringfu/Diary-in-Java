package chapter5;

/**
 * 5.9 匿名类  page 121
 * by: fy   time：2018-03-19
 */

import javax.swing.*;
import java.awt.event.*;

public class WindowTest extends JFrame{
    public WindowTest(){
        this.addWindowListener(new WindowAdapter() {  //fy：匿名类直接生成匿名对象
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new WindowTest();
    }
}
/*
* 笔记：
* 1，匿名类就是没有名称的内部类，它的类和类方法定义在一个表达式中
* 2，匿名类适合创建只需一次使用的类并且类中的代码较少
* 3，匿名类必须继承一个父类或者实现一个接口
* 4，匿名类不能是抽象类
* 5，匿名类不能定义构造方法，因为它没有类名*/
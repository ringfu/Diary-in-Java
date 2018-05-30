package chapter5;


/**
 * 5.8 内部类      page 120
 * by: fy   time: 2018-03-19
 */


public class OuterClass {
    private  int x = 1;
    class InnerClass{  //fy: 内部类在外部类的类体里面定义
       private int y = 2;
    }

    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic =oc.new InnerClass();  //fy：！！！一定要先创建外部类实例，然后再用外部类实例创建内部类实例
        System.out.println("outer class :" + oc.x);  //fy: x 是private修饰的，为什么可以用对象名调用？？？
        System.out.println("inner class :" + ic.y);
    }
}

//fy: x 是private修饰的，为什么可以用对象名调用？ 因为这个main方法在主类里面, 这时候认为是类成员调用私有变量
/*
* 笔记：
* 1，内部类提供了更好的封装，可以把内部类隐藏在外部类之内
* 2，内部类被看做外部类的成员，所以内部类可以访问外部类任意属性（变量和方法），但是外部类不能访问内部类的属性
* 3，内部类对象不能单独存在，必须依赖一个外部类对象，也就是说要先创建外部类对象才能创建内部类对象
* 4，内部类可以被定义为抽象类或者接口，但必须被其他的内部类继承或实现
*/
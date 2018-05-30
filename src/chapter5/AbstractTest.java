package chapter5;
/**
 * 5.6 抽象类  page 111
 * by: fy   time: 2018-03-15
* */

abstract class Shape{
    public abstract double calcArea();
    public Shape(){}
    public Shape(String name){
        System.out.println(name + "shape created");
    }

    @Override
    public String toString() {
        return "this is a shape";
    }
}
class Circle extends Shape{
    public float r;
    private final float PI = 3.14f;
    public Circle(String name, float r){
        super(name);
        this.r = r;
    }
    public double calcArea(){
        return PI*r*r;
    }
}

class Rectangle extends Shape{
    private float wigth, heigth;
    public Rectangle(String name, float wigth, float heigth){
        super(name);
        this.heigth = heigth;
        this.wigth = wigth;
    }

    @Override
    public double calcArea() {
        return wigth*heigth;
    }
}
public class AbstractTest {
    public static void main(String[] args) {
        Shape s1 = new Circle("circle", 3);
        System.out.println(s1.calcArea());
        Shape s2 = new Rectangle("rectangle", 1,2);
        System.out.println(s2.calcArea());
    }
}


/*
* 笔记：
* 1，抽象类：用abstract修饰，含有抽象方法的类，描述几个类的共同行为
* 2，抽象方法：只有方法的申明， 没有方法体，在形参列表后面没有{}， 而是以‘；’结束
* 3， 抽象类不能创建实体，抽象类是供继承用的， 由子类实现父类的抽象方法，
* 4，意义: 抽象类提现的是模板模式的设计，它作为多个子类的模板， 子类可以在其基础上进行扩展，改造，但总体上会保留抽象类的行为特征
*  */
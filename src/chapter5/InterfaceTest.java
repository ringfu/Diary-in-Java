package chapter5;
/**
 * 5.7 接口   page115
 * by；fy    time: 2018-03-15
 */
 interface Figure{
    final double PI = 3.14;
    abstract void area();  //fy：interface里面只能有abstract方法和常量
}

interface Paint{
     //String color;
     abstract void draw(String color);
}

class Circle2 implements Figure, Paint{  //fy: 接口可以多继承，用implement加父类名
     double r;
     public Circle2(double r){
         this.r = r;
         //this.color = color;  //fy: 接口里面定义的变量都是static，final类型， 不能再被赋值
     }
     public void  area(){
         System.out.println("circle area: "+ PI*r*r);
     }
     public void draw(String color){
         System.out.println("circle draw "+ color);
      }
}
class Rectangle2 implements Figure{
     double width, heigth;
     public Rectangle2(double width, double heigth){
         this.heigth = heigth;
         this.width = width;
     }
     public void area(){
         System.out.println("rectangle area: "+width*heigth);
     }
     public void draw(String color){
         System.out.println("rectangle draw "+color);
     }
}
public class InterfaceTest {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(1);
        c1.area();
        c1.draw("green");

        Rectangle2 r1 = new Rectangle2(1,2);
        r1.area();
        r1.draw("red");
    }
}


/*
* 笔记：
* 1，interface定义：interface是一种更加特殊的抽象类，interface有且只要抽象方法以及用abstract，final修饰的常量
* 2，interface支持多继承，用extends或者implements加父类名构成多继承
* 3，一个java文件里面只能有一个public修饰的interface， 默认是包访问权限
* 4,implements 和 extends的区别：
*       extends 用于继承，包括父类和子类之间继承， 接口和接口之间继承
*       implements 用于接口使用，非抽象类使用接口时用implements
*  eg：
*      子类名 extends 父类名{...}
*      下级接口名 extends 上级接口名1，上级接口名2...{...}
*
*      类名 implements 接口名1，接口名2...{...}
*
*      子类名 extends 父类名 implements 接口名1，接口名2...{...}    这个重点注意
*/
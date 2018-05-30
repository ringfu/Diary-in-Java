package chapter5;

/**
 * 5.3 静态初始化块   page 102
 * by: fy   time： 2018-03-14
 */

class Root{
    static {
        System.out.println("Root static initial block");
    }
    {
        System.out.println("Root: normal initial block");
    }
    public Root(){
        System.out.println("Root gouzao ");
    }
}

class Mid extends Root{
    static {
        System.out.println("Mid: static initial block");
    }
    {
        System.out.println("Mid: normal initial block");
    }
    public Mid(){
        System.out.println("Mid gouzao");
    }
}
public class Leaf extends Mid{
    static {
        System.out.println("Leaf: static initial block");
    }
    {
        System.out.println("Leaf: normal initial block");
    }
    public Leaf(){
        super(); //fy：在类初始化方法里面调用父类初始化方法
        System.out.println("Leaf: gouzao");
    }

    public static void main(String[] args) {
        new Leaf();
    }
}


/*
* 笔记：
* 1，继承用extend， java里面只能单继承， 但是可以多代继承
* 2，子类初始化时先要执行父类初始化方法
* 3，用this指示调用本类， 用super指示调用父类
* 4，类初始化的含义：第一次使用某个类的时候，会将类加载到虚拟机里面， 后面再创建类对象的时候不用再次加载*/
package chapter5;

/**
 * 5.4 单例类  page 105
 * by: fy   time: 2018-03-14
 */

class Singleton{
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        //instance = new Singleton();
        return  instance;
    }
}

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}

/*
* 笔记：
* 1，一般类的构造方法用public修饰， 任何类都可以自由创建对象，浪费资源
* 2，单例类： 一个类只允许创建一个对象， 单例类的构造方法用static修饰， 并且要提供一个public方法
*   作为该类的访问点
* 3，优点及其用途：节约资源； 保证特殊对象的一致性；
*               在网络上统计访问量时可以用单例类对象实现
 */
package chapter5;

/**
 * 5.2 子类对象和父类对象的互换     page 99
 * by: fy   time: 2018-03-15
 */

class Person{
    String str = "Person";
    public void print(){
        System.out.println("Person类print方法，对象是："+this.str+"\n");
    }
}
class Student extends Person {
    String str = "student"; //fy：子类中存在与父类同名的变量， 则在子类中隐藏父类变量
    public void print(){
        //fy: 子类重写父类方法， 则父类方法在子类中不存在
        System.out.println("Student类print方法，对象是："+this.str+"\n ");
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("Person变量p1.str："+p1.str);
        System.out.println("person对象p1调用print()结果：");
        p1.print();

        Student s1 = new Student();
        System.out.println("Student变量s1.str："+s1.str);
        System.out.println("Student对象s1调用print()结果：");
        s1.print();

        Person p2 = new Student();
        System.out.println("Person变量p2.str： "+p2.str);
        System.out.println("Person对象p2调用print()结果：");
        p2.print();

    }
}
/*笔记：
* 1，用父类引用指向子类对象，当子类中重写父类方法或者含有与父类同名的变量时，
*   父类方法在子类中不存在， 子类同名变量隐藏父类变量，当使用父类引用调用同名变量时，
*   指向的是父类变量。
*
* */
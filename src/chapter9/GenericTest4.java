//package chapter9;
/*
* 9.4 受限类型参数    page 186
* by: fy    time: 2018-03-23
* */

class Person{
    public void print(){
        System.out.println("person class");
    }
}

class Student extends Person{
    public void print(){
        System.out.println("student class");
    }
}

class Teacher extends Person{
    public void print(){
        System.out.println("teacher class");
    }
}

public class GenericTest4<T extends Person>{  //fy: T 泛类型 继承Person类型
    private T t;
    public GenericTest4(T t){
        this.t = t;
    }
    public void testprint(){
        t.print();
    }

    public<T2> void getst(T2 t){
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args) {
        GenericTest4<Person> t1 =new GenericTest4<Person>(new Person());
        t1.testprint();
        t1.getst(t1);

        GenericTest4<Student> t2 = new GenericTest4<Student>(new Student());
        t2.testprint();


        GenericTest4<Teacher> t3 = new GenericTest4<Teacher>(new Teacher());
        t3.testprint();

        GenericTest4<? extends Person> t4 = t3;  //fy：？通配符限制， 限制 ？通配符只能是继承于Person类
        t4.testprint();
        t4.getst(t4);
    }
}

/*
* 笔记：
* 1，public class GenericTest4<T extends Person> 在主类里面限制 T 泛型只能继承于Person类
*   所以 GenericTest4 类里面用泛型申明的实例对象限制一定要继承于Person类
*2，GenericTest4<? extends Person> t4 = t3 通配符 ？可以继承于任何类
* */
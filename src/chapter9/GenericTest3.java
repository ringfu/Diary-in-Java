package chapter9;
/*
* 9.3 类型通配符     page 184
* by: fy    time: 2018-03-23
* */

import java.util.Vector;

public class GenericTest3 {
    //fy: 类型通配符 Vector<?> 使用
    static void printC(Vector<?> c){
        for (Object e: c
             ) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Vector<String> s = new Vector<String>();
        for(int i = 0; i < 5; i++){
            s.add(new Integer(i).toString());
        }

        printC(s);
    }
}

/*
* 笔记：
* 1， static void printC(Vector<?> c){
        for (Object e: c
             ) {
            System.out.println(e);
        }
    }
    这段代码中Vector<？> 称为类型通配符， 可以被任意类型对象调用
    即这段代码可以打印出任意类型泛型集合
* 2，但是需要注意的是，使用Vector<?>生成的泛型不能插入对象，因为 ？类型未知，而插入必须是子类型；
*/
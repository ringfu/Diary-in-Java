package chapter9;
/*
* 9.1 泛型*/
import java.util.Vector;

public class GenericTest {
    public static void main(String[] args) {
        Vector<Integer> c = new Vector<Integer>();
        for (int i = 0; i < 10; i++){
            c.add(i*i);
        }
//        c.add(15);
//        c.add(new Integer(20));
        for (int i = 0; i < c.size(); i++){
            Integer val = c.get(i);
            System.out.println(val);
        }
    }
}

/*
* 笔记：
* 1，Vector泛型可以向其中添加任何类型元素，但在使用时我们希望元素转化成我们希望的格式
* 2，Vector<Type> 表示一个Type类型的容器，里面可以动态添加元素， 但元素类型必须是Type类型
* */

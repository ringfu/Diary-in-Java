package chapter10;

import java.util.*;
//fy: HashTable及其方法的使用
public class CollectionTest {
    public static void main(String[] args) {
//        Hashtable ht = new Hashtable();  //fy：没有指定键值对格式，可以插入任意格式键值对
//        ht.put(1,"fy");
//        ht.put(2,10);
//        ht.put(3, 'r');
//        System.out.println(ht);
        Hashtable<Integer,String> ht = new Hashtable<Integer, String>();
        ht.put(1,"fu");
        //ht.put(2,10);  //fy：在指定HashTable的键值对类型后，后面对其进行put和get方法时必须按照格式
    }
}

//fy:HashSet及其方法的使用
//public class CollectionTest {
//    public static void main(String[] args) {
//        HashSet hs = new HashSet();  //fy：HashSet继承于Set接口， Set接口继承于Collection接口
//        hs.add("fy");
////        System.out.println(hs);
//        hs.add(2);
////        System.out.println(hs);
//        hs.add(0.0010);
////        System.out.println(hs);
//        System.out.println(hs.contains("fy"));
//        System.out.println(hs.remove(11));
//        hs.toArray();
//        System.out.println(hs);
//        System.out.println(hs.toArray()[0]);
////        Iterator it = hs.iterator();
//// fy: Iterator it = hs.iterator() 方法返回一个Iterator对象，用于遍历Collection中每一个元素
////        while (it.hasNext()){
////            System.out.println(it.next());
////        }
//    }
//}

//fy:Vector及其方法的使用
//public class CollectionTest{
//    public static void main(String[] args) {
//        Vector v = new Vector(10);
//        v.addElement("fy");
//        System.out.println(v);
//        v.addElement(20);
//        System.out.println(v);
//        v.addElement('h');
//        System.out.println(v);
//        v.clear();
//        System.out.println(v.isEmpty());
//    }
//}

/*
* 笔记：
* 1，集合框架API构成：
*API : java.util {(interface) Collection, Map }
   (interface) Collection {(interfa0 ce)Set, (interface) List}
*                          Set{(class) HashSet}
*                          List{(class)LinkList, Vector}
*                                   Vector{(class) Stack}
*  (interface) Map{(class) HashTable}
*               HashTable{(class) Properties}
*
* 2,HashTable 和 HashSet 都是用键值对来存储的数据
* 创建HashTable和HashSet都可以指定键值对类型，一旦指定后面对其插入，获取等方法参数必须按其类型
* */
package chapter4;

/**
 * 4.2.2 长度可变的字符串使用   page 76
 * by: fy  time:2018-03-14
 * */

public class Varargs {
    public static void outClassInf(String className, String...studentNames){
        //fy: String...studentNames is a varible length array.
        //when it be used, it traversal the whole array.
        System.out.println("class name: "+className);
        System.out.println("student name: ");
        for (String sn:studentNames)
            System.out.println(sn);
    }
    public static void main(String[] args) {
        outClassInf("computer 3","fy","csk","jk");
    }
}

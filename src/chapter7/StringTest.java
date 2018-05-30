package chapter7;

import java.util.Date;

/**
 *  7.3 字符串类型   page143
 *  by: fy  time:2018-03-21
 */

public class StringTest {
    public static void main(String[] args) {
        byte[] b = {66,67,68,100,101};
        System.out.println(new String(b));

        char[] c = {'a','b','c','d','e'};
        System.out.println(c);

        String str1 = "Java Application ", str2 = " and Applet";
        System.out.println(str1.trim().concat(str2));
        System.out.println(str1.replace('A','a'));
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str1.substring(5,8));
        System.out.println(str1.charAt(5));
        System.out.println(str1.startsWith("App"));
        System.out.println(str1.startsWith("java"));
        System.out.println(str1.startsWith("Java"));
        System.out.println(str1.length());
        String s1 = "hello world", s2 = "hello i am fy", s3 = "hello I'm fu";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(new String("hello world")));
        System.out.println(s1.equalsIgnoreCase(new String("HELLO WORLD")));

        //fy： StringBuffer 使用
        StringBuffer strbuf = new StringBuffer("aaa");
        System.out.println(strbuf.append("bbb"));
        System.out.println(strbuf.insert(3,'+'));
        System.out.println(strbuf.reverse());
        System.out.println(strbuf.append(new Date()));

        //fy： 计算strs里面有多少以st开头，以ng结尾的字符串；
        String[] strs = {"string","starting","strong","street","stir","student","sting"};
        int st_count = 0, ng_count = 0;
        for (String str:strs
             ) {
            if (str.startsWith("st")){
                st_count++;
            }
            if (str.endsWith("ng")){
                ng_count++;
            }

        }
        System.out.println("st_: "+ st_count + "; "+ "ng_: " + ng_count);


    }
}

package chapter4;

/**
 * 4.2.4 方法重载  page 79
 * by: fy   time:2018-03-14
 */


public class OverloadVarargs {
    public void test(){
        System.out.println("no parameter function");
    }
    public void test(String parameter){
        System.out.println("one parameter function: "+ parameter);
    }
    public void test(String...parameter){
        System.out.println("many parameters function");
        for (String para:parameter )
            System.out.println(para);
    }

    public static void main(String[] args) {
        OverloadVarargs ov = new OverloadVarargs();
        //test1: no parameter
        ov.test();
        //test2: one parameter
        ov.test("hello");
        //test3: two parameter
        ov.test("hello","world");
        //test4: one parameter but in array
        ov.test(new String[]{"hello"});

    }
}


/*
 * 反应的问题：
 * 1：注释也很重要， 而且注意注释的反斜杠的匹配
 * 2：不管方法是什么访问权限，都要定义对象，用对象名或者是用类名调用
 * 3：方法的重载要求方法返回值，方法名一样但是形参列表不一样， 或者是类型， 或者是长度
 * 4：可以在任意地方new一个对象， 例如：ov.test(new String[]{"hello"});
 * */
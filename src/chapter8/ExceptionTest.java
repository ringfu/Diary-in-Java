package chapter8;
/**
 * 8.2 异常处理机制   page 172
 * by: fy   time: 2018-03-21
 */

public class ExceptionTest {
//    public static void main(String[] args) {
//        try {
//            int a = args.length;
//            System.out.println("a = "+a);
//            int b = 42/a;
//            int c[] = {1};
//            c[42] = 99;
//        }catch (ArithmeticException e){
//            System.out.println("div by 0: "+e);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("array index obb:" + e);
//        }
//    }
static void demoproc(){
    try {
        throw new NullPointerException("demo3");
    }catch (NullPointerException e){
        System.out.println(" caught inside demoproc");
        throw e;
    }
}

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("recaught :"+e);
        }
    }
}

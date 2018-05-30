package chapter9;

class Student<T1,T2>{
    private String name;
    private T1 t;
    private T2 p;
    public Student(String name, T1 t, T2 p){
        this.name = name;
        this.t = t;
        this.p = p;
    }
    public T1 getT1(){
        return t;
    }
    public T2 getT2(){
        return p;
    }

}

public class GenericTest2 {
    public static void main(String[] args) {
        Student<String,Double> stu1 = new Student<String,Double>("fy","19970928",11.0);


        System.out.println("stu1 ；"+ stu1.getT1() +";"+  stu1.getT2());
//        System.out.println("stu2 : "+stu2.getT());
    }
}

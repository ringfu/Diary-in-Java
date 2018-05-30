package experiment.experiment5;

class SimpleThread extends Thread{
    public SimpleThread(String str){
        super(str);
    }
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println(i + " " + getName());
            try {
                sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("DONE!"+getName());
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        new SimpleThread("go to BeiJing").start();
        new SimpleThread("stay here!").start();
    }
}


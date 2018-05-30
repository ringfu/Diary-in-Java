package experiment.experiment5;

public class RunnableTest1 implements Runnable {
    public void run(){
        try {
            for(int i = 0; i < 5; i++){
                Thread.sleep(1000);
                System.out.println("runnable:" + i);
            }
        }catch (Exception e){}
    }


    public static void main(String[] args) {
        Runnable r1 =new RunnableTest1();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();

        try {
            for(int i = 0; i < 5; i++){
                Thread.sleep(1000);
                System.out.println("main:" + i);
            }
        }catch (Exception e){}

    }
}

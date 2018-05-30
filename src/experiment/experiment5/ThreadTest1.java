package experiment.experiment5;

public class ThreadTest1 extends Thread {
    public static void main(String[] args) {
        Thread tt1 = new ThreadTest1();
        Thread tt2 = new ThreadTest1();

        tt1.start();
        tt2.start();

        try {
            for (int i = 0; i < 5; i++){
                Thread.sleep(1000);
                System.out.println("main: " + i);
            }
        }catch (Exception e){ }
    }
        public void run () {
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(1000);
                    System.out.println("run: " + i);
                }
            } catch (Exception e) {
            }
        }

}
package chapter13;

class Tickets{
    private int tickets;

    public int getTickets() {
        return tickets;
    }
    public void setTickets(int tickets) {
        this.tickets = tickets;
    }
    public Tickets(){
        tickets = 10;
    }
    public synchronized void buyTicksts(String name){
        System.out.println(name+"buy tickets no:"+tickets);
        tickets--;
    }
}
class TicketsThread extends Thread{
    Tickets t;
    String name;
    public TicketsThread(String name, Tickets t){
        this.name = name;
        this.t = t;
        start();
    }
    public void run(){
        try{
            while (t.getTickets()> 0){
                t.buyTicksts(name);
                Thread.sleep(20);
            }
        }catch (Exception e){}
    }
}
public class MulThreadTest {
    public static void main(String[] args) {
        Tickets t = new Tickets();
        TicketsThread t1 = new TicketsThread("miss li",t);
        TicketsThread t2 = new TicketsThread("sir mai",t);
    }
}

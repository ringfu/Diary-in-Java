package chapter5;

import java.sql.SQLOutput;

// animal父类
class Animal{
    private String type;
    public Animal(String type){
        this.type = type;
    }
    public String toString(){
    return  this.type;
    }
    public void sound(){
        if(this.type == "bird"){
            System.out.println("bird tweet!");
        }
        else if (this.type == "land animal") {
            System.out.println("land animal howl");
        }
    }
}
//Flyable接口
interface Flyable{
    double flySpeed();
}
//Glede类继承父类和接口
class Glede extends Animal implements Flyable{  //

    public Glede(String type) {
        super(type);
    }


    @Override
    public double flySpeed() {
        return 100;
    }
}
//Pigeon继承父类和接口
class Pigeon extends Animal implements Flyable {

    public Pigeon(String type) {
        super(type);
    }

    @Override
    public double flySpeed() {
        return 50;
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Glede g = new Glede("land animal");
        Pigeon p = new Pigeon("bird");

        System.out.println("glede info");
        g.sound();
        System.out.println("glede speed: "+ g.flySpeed());

        System.out.println("\n");

        System.out.println("pigeon info");
        p.sound();
        System.out.println("pigeon speed: " +  p.flySpeed());

    }
}

package experiment.experimentOne.experimentTwo;
import java.math.*;

import static java.lang.Math.sqrt;

abstract class  Rectangle{
    public Rectangle(String name){
        System.out.println("create " + name);
    }
    public abstract double diagonal();
}
public class Square extends Rectangle{
    int edge;
    public Square(String name, int edge) {
        super(name);
        this.edge = edge;
    }
    public double diagonal(){
       return sqrt(2*edge*edge);
   }
    public static void main(String[] args) {
        Square s = new Square("square",5);
        System.out.println("the edge length is："+ s.diagonal());
    }
}

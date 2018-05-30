package chapter6;
/**
 * 6.1 数组的建立和初始化，foreach的使用     page128
 * by: fy   time：2018-03-20
 */

class Point{
    int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void display(){
        System.out.println("position："+ "（"+ x + ","+ y + "）");
    }
}
public class ArrayTest {
    public static void main(String[] args) {
        Point[][] p = new Point[5][];  //fy: 二维数组创建时第一维数一定要先固定
        for (int i = 0; i < p.length; i++){
            p[i] = new Point[2*i];  //fy：JAVA里面二维数组的第二维数可以不一样
            for(int j = 0; j < p[i].length; j ++){  //fy: java里面数组对象拥有系统自带的length方法， 可以获取数组长度
                p[i][j] = new Point(i+j,i-j);
            }
        }

        for(int i = 0; i < p.length; i++){
            for (int j = 0; j < p[i].length; j++){
                p[i][j].display();
            }
        }
    }
}

/*
* 笔记：
* 1，数组定义的时候可以进行初始化或者手动对每一维分别进行初始化
* 2，数组foreach循环的使用方法：
*       for（数组元素类型  形参名 : 数组名）{
*       ...迭代访问每个元素}
*       eg：
*       int[] age = {1,2,3,4,5,6};
*       for(int AGE : age){
*       System.out.println(AGE)；
*       }
*
* 3，数组排序： import java.util.Array
*               这个java.util.Array包里面有排序方法 sort()
*               定义： public static void sort(<type>[] arr)
*               默认int按升序排序， String按字典排序
* */
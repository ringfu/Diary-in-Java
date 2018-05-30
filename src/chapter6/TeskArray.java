package chapter6;

import java.lang.reflect.Array;
import java.util.Arrays;
public class TeskArray {
//    public double max(double arr[][]){
//        double max = arr[0][0];
//        for(int i = 0;i < arr.length; i++){
//            for (int j = 0 ; j < arr[i].length; j ++){
//                if (arr[i][j] > max) max = arr[i][j];
//            }
//        }
//        return  max;
//    }
    public static void main(String[] args) {
       double[][] grade =  {{11},{22,33},{44,55,66}};
//        for (double[] g1:grade
//             ) {
//            for (double g2:g1
//                 ) {
//                System.out.println(g2 + " ");
//            }
//            System.out.println("\n");
//        }
//        double total = 0;
//        for(int i = 0 ;i < grade.length; i++){
//            for(int j = 0; j < grade[i].length; j ++){
//                total += grade[i][j];
//            }
//        }
//        double eqal = total/(3*3);
//
//        Arrays.sort(grade);
//        double max = grade[2][2];
//        double min = grade[0][0];
//        for (double[] g1:grade
//                ) {
//            for (double g2:g1
//                    ) {
//                System.out.println(g2 + " ");
//            }
//            System.out.println("\n");
//        }
//        System.out.println("max: " + max);
//        System.out.println("min: " + min);
//        System.out.println("eqal: " + eqal);
        for (double[] g1 : grade
             ) {
            for (double g2: g1
                 ) {
                System.out.println("each element: " + g2);

            }
            System.out.println("\n");
        }

    }
}

/*笔记：
* 1，foreach 可以用在二维数组里面，而且无论数组是矩阵形式还是二维长度不定形式，
*       foreach 就相当于结合了 for 和 .length
**/
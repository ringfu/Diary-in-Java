//package experiment.experimentOne.experimentTwo;


import java.io.IOException;

public class Sort{
    public static void bubbleSort(double arr[]){
        int i, j;
        double temp;
        for(i = 0; i < arr.length ; i++){
            for(j = i; j < arr.length ; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        double[] arr = new double[]{43.2, 33.2, 99.0, 23.5, 10.2, 34.2, 23.2};
        System.out.println("the array before sort:");
        for (double a:arr
             ) {
            System.out.println(" " + a);
        }
        System.out.println("the array after sort: ");
        bubbleSort(arr);
        for (double a:arr
             ) {
            System.out.println(" " + a);
        }
    }
}

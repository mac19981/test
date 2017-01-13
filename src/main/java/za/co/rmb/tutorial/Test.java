package za.co.rmb.tutorial;


import java.util.ArrayList;
import java.util.Collections;

public class Test {


    public static void add1(int[] arrX)
    {
      for (int i=0;i<arrX.length;i++){
          arrX[i]=arrX[i]+1;
      }
    }

    public static void printArray(int[] arrX) {
        for (int i = 0; i < arrX.length; i++) {
            System.out.println(arrX[i]);
        }}

    public static void main(String[] args) {

        ArrayList<String> obj = new ArrayList<String>();
        int[] arr1 = {65, 58, 79, 69, 88, 36, 19, 10, 94, 12, 97, 48, 3, 25, 88, 8, 26, 58, 4, 72, 18, 33, 53, 56, 24, 50, 28, 1, 1, 43, 51, 95, 24, 49, 4, 28, 82, 50, 86, 84, 83, 88, 99, 55, 78, 81, 61, 36, 96, 1};
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

printArray(arr1);


    int[] arr2 = {65, 58, 79, 69, 88, 36, 19, 10, 94, 12, 97, 48, 3, 25, 88, 8, 26, 58, 4, 72, 18, 33, 53, 56, 24, 50, 28, 1, 1, 43, 51, 95, 24, 49, 4, 28, 82, 50, 86, 84, 83, 88, 99, 55, 78, 81, 61, 36, 96, 1};
    int[] arr3 = new int[arr2.length];
        System.arraycopy(arr2, 0, arr3, 0, arr2.length);
        add1(arr3);
        int [] arr4=arr2.clone();
        System.out.println();


        printArray(arr3);
        System.out.println();
        printArray(arr4);
        int[] arr5=arr2;
}


}
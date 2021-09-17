//Created by Duckulus on 17.09.2021

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {

        //initializes an array of the size 20 and fills it with random numbers.
        int[] arr = new int[20];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = new Random().nextInt(1000);
        }

        printArray(arr);
        bubblesort(arr);
        printArray(arr);
    }

    /**
     * Method bubblesort
     * After calling this method the passed array will be sorted in an ascensding order.
     *
     * It works by iterating through the array and comparing each number with the one after it.
     * If it's in the wrong place they switch places through a triangular swap.
     *
     * @param arr The array to be sorted
     */
    public static void bubblesort(int[] arr) {
        boolean finished = false;
        while(!finished) {
            finished = true;
            for(int j = 0; j< arr.length-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    finished = false;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }


}

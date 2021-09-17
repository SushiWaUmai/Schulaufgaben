//Created by Duckulus on 17.09.2021

//Created by Duckulus on 17.09.2021

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {

        //initializes an array of the size 20 and fills it with random numbers.
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(1000);
        }

        printArray(arr);
        insertionSort(arr);
        printArray(arr);
    }

    /**
     * Method selectionsort
     * After calling this method the passed array will be sorted in an ascensding order.
     *
     * @param arr The array to be sorted
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;

        }
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }


}


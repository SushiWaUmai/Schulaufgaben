//Created by Duckulus on 21.09.2021

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BogoSort {

    public static void main(String[] args) {

        //initializes an array of the size 10 and fills it with random numbers.
        //The method will take forever if you put anything above 10, change with caution
        int[] arr = new int[10];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(1000);
        }

        bogoSort(arr);
    }


    /**
     * Method bubblesort
     * After calling this method the passed array will be sorted in an ascensding order.
     *
     * It shuffles the array until it is sorted.
     * After finishing it prints out the amount of shuffles.
     *
     * @param array The array to be sorted
     */
    static void bogoSort(int[] array) {
        int i = 0;
        while (!isSorted(array)) {
            shuffleArray(array);
            i++;
            System.out.println(Arrays.toString(array));
        }
        System.out.println("Array sorted with " + i + " Shuffles!");
    }

    static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }

    static void shuffleArray(int[] array)
    {
        Random rnd = ThreadLocalRandom.current();
        for (int i = array.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }
}

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {

        //initializes an array of the size 20 and fills it with random numbers.
        int[] arr = new int[20];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = new Random().nextInt(1000);
        }

        printArray(arr);
        selectionSort(arr);
        printArray(arr);
    }

    /**
     * Method selectionsort
     * After calling this method the passed array will be sorted in an ascensding order.
     *
     * @param arr The array to be sorted
     */
    public static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }


}

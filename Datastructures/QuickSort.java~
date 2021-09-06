// Java implementation of QuickSort
import java.io.*;
 
class QuickSort 
{     
    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
     
        for(int j = low; j < high; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, high);
        return i;
    }
     
    private static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
     
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static void printArray(int[] arr)
    {
        System.out.print("[");
        for(int i = 0; i < arr.length - 1; i++)
            System.out.print(arr[i] + ", ");
             
        System.out.println(arr[arr.length - 1] + "]");
    }

    public static void main(String[] args)
    {
        int[] arr = { 7, 2, 7, 21, 7, 3, 1 };
        System.out.println("Start: ");
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("End: ");
        printArray(arr);
    }
}

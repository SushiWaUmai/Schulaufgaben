// Java implementation of QuickSort
 

/**
 * @author Eugene Matsumura
 * @version 1.0.0
 */
public class QuickSort 
{     
    private static void swap(int[] arr, int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        printArray(arr);
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
        int[] arr = { 23, 98, 44, 28, 12, 18, 59, 25, 72 };
        System.out.println("====================");
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("====================");
        printArray(arr);
    }
}

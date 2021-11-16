
public class LinearSerach 
{
    // Main function that tests both methods
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;
        int index = searchIterative(arr, key);
        System.out.println("Index of " + key + " is " + index);
        index = searchRecursive(arr, key, 0);
        System.out.println("Index of " + key + " is " + index);
    }

    public static int searchIterative(int[] arr, int x)
    {
        for (int i = 0; i < arr.length; i++)  
        {
            if(arr[i] == x)
                return i;
        }
        return -1;
    }

    public static int searchRecursive(int[] arr, int x, int pos)
    {
        if(pos == arr.length)
            return -1;
        if(arr[pos] == x)
            return pos;
        return searchRecursive(arr, x, pos + 1);
    }
}

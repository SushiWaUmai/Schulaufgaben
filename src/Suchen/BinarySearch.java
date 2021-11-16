public class BinarySearch {
    // Main function that tests both methods
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;
        int index = searchIterative(arr, key);
        System.out.println("Index of " + key + " is " + index);
        index = searchRecursive(arr, key);
        System.out.println("Index of " + key + " is " + index);
    }

    public static int searchRecursive(int[] arr, int x)
    {
		int l = 0, r = arr.length - 1; 
		while (l <= r) { 
			int m = l + (r - l) / 2; 

			if (arr[m] == x) 
				return m; 

			if (arr[m] < x) 
				l = m + 1; 

			else
				r = m - 1; 
		} 

		return -1; 
    }

    public static int searchIterative(int[] arr, int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
}
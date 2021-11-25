public class Zahlenfeld {
    private int[] arr;

    public Zahlenfeld() {
        arr = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    }

    public int linearSearchIterative(int x)
    {
        for (int i = 0; i < arr.length; i++)  
        {
            if(arr[i] == x)
                return i;
        }
        return -1;
    }

    public int linearSearchRecursive(int x, int pos)
    {
        if(pos == arr.length)
            return -1;
        if(arr[pos] == x)
            return pos;
        return linearSearchRecursive(x, pos + 1);
    }

    public int binarySearchIterative(int x)
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

    public int binarySearchRecursive(int l, int r, int x)
    {
        if (r >= l && l < arr.length - 1) { 
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
 
            if (arr[mid] > x)
                return binarySearchRecursive(l, mid - 1, x);
 
            return binarySearchRecursive(mid + 1, r, x);
        }
 
        return -1;
    }
}
public class Sotieren {
    public static void main(String args[])
    {
        int[] a = new int[] {4, 2, 3, 1, 5};

        System.out.println("Unsorted array: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        Sotieren1(a);

        System.out.println("\nSorted array: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    private static void Sotieren1(int[] a) {
        int laenge = a.length;
        int marke;
        for (int i = 1; i < laenge; i++) {
            marke = a[i];
            int j = i;
            while (j > 0 && a[j - 1] > marke) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = marke;
        }
    }
}
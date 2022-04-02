import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[10];
        int n = array.length;
        Random random = new Random();
        System.out.print("The output array is:\n[");
        /* Making of the array */
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(20) + 1;
            if (i == n - 1) {
                System.out.println(array[i] + "]\n\n== SORTING THE ARRAY ==\n");
            } else System.out.print(array[i] + "  ");
        }

        /* The actual algorithm: */
        qsort(array, 0, n - 1);

        /* Array output */
        System.out.print("The sorted array is:\n[");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.print(array[i] + "  ");
            }
        }
    }

    private static void qsort(int[] array, int b, int e) {
        int piv = array[(b + e) / 2], l = b, r = e, buf;
        while (l <= r) {
            while (array[l] < piv) l++;
            while (array[r] > piv) r--;
            if (l <= r) {
                buf = array[l];
                array[l] = array[r];
                array[r] = buf;
                l++;
                r--;
            }
        }
        if (b < r) qsort(array, b, r);
        if (l < e) qsort(array, l, e);
    }
}

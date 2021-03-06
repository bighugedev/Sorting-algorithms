import java.util.Random;

public class GnomeSort {

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
        int i = 1, j = 2, buf;
        while (i < n) {
            if (array[i - 1] > array[i]) {
                buf = array[i];
                array[i] = array[i - 1];
                array[i - 1] = buf;

                i--;
                if (i > 0) continue;
            }
            i = j++;
        }

        /* Array output */
        System.out.print("The sorted array is:\n[");
        for (i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.print(array[i] + "  ");
            }
        }
    }
}

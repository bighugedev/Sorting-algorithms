import java.util.Random;

public class SelectionSort {

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
        for (int i = 0, buf; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                buf = array[i];
                array[i] = array[min];
                array[min] = buf;
            }
        }

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
}

import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = new int[10];
        int n = array.length, numberOfIterations = 0;
        Random random = new Random();
        System.out.print("The output array is:\n[");
        /* Making of the array */
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(20) + 1;
            if (i == n - 1) {
                System.out.println(array[i] + "]\n\n== SORTING THE ARRAY ==\n");
            } else
                System.out.print(array[i] + "  ");
        }

        /* The actual algorithm: */
        for (int i = 1; i < n; i++) {
            int j, x;
            for (j = i, x = array[i]; j > 0 && array[j - 1] > x; j--) {
                array[j] = array[j - 1];
            }
            array[j] = x;

            numberOfIterations++;
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
        System.out.print(" - Number of iterations: " + numberOfIterations);
    }
}

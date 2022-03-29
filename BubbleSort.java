import java.util.Random;

public class BubbleSort {

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
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                numberOfIterations++;
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
        System.out.print(" - Number of iterations: " + numberOfIterations);
    }
}

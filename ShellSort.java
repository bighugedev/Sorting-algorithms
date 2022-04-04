import java.util.Random;

public class ShellSort {

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
        for (int d = n / 2; d >= 1; d /= 2) {
            for (int i = d; i < n; i++) {
                int j, x = array[i];
                for (j = i; j >= d; j -= d) {
                    if (x < array[j - d]) {
                        array[j] = array[j - d];

                    } else break;
                }
                array[j] = x;
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

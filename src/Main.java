import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int array100[] = new int[100];
        int array1000[] = new int[1000];
        int array10000[] = new int[10000];
        int arrays[][] = { array100, array1000, array10000 };

        fillArrays(arrays);

        System.out.println("bubbleSort:\n");

        for (int[] array : arrays) {
            long start = System.currentTimeMillis();

            SortMethods.bubbleSort(array);

            long end = System.currentTimeMillis();

            // printArray(array);

            System.out.println("Array of " + array.length + " elements:");
            System.out.println("Time spent: " + (end - start) + "ms");
        }

        printArray(arrays[0]);

        // System.out.println("\nmergeSort:\n");

        // for (int[] array : arrays) {
        //     long start = System.currentTimeMillis();

        //     SortMethods.mergeSort(array, 0, array.length - 1);

        //     long end = System.currentTimeMillis();

        //     printArray(array);

        //     System.out.println("Array of " + array.length + " elements:");
        //     System.out.println("Time spent: " + (end - start) + "ms");
        // }
    }

    public static void fillArrays(int[][] arrays) {
        for (int[] array : arrays) {
            for (int i = 0; i < array.length; i++) {
                array[i] = randomFill();
            }
        }
    }

    public static int randomFill() {
        return new Random().nextInt();
    }

    public static void printArray(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; ++i) {
            System.out.println(arr[i] + " ");
        }
    }
}

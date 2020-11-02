import java.util.Arrays;
import java.util.Random;

public class Scenario1 {
    public static void invoke() {
        int[][] arrays = getArrays();
        int[][] arraysCopy = new int[arrays.length][];

        copyArray(arrays, arraysCopy);
        bubbleSortBenchmarking(arraysCopy);
        copyArray(arrays, arraysCopy);
        mergeSortBenchmarking(arraysCopy);
    }

    public static int[][] getArrays() {
        int array100[] = new int[100];
        int array1000[] = new int[1000];
        int array10000[] = new int[10000];
        int array100000[] = new int[100000];
        int arrays[][] = { array100, array1000, array10000, array100000 };

        fillArrays(arrays);

        return arrays;
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

    public static void copyArray(int arrays[][], int arraysCopy[][]) {
        for (int i = 0; i < arrays.length; i++) {
            arraysCopy[i] = Arrays.copyOf(arrays[i], arrays[i].length);
        }
    }

    public static void bubbleSortBenchmarking(int[][] arrays) {
        System.out.println("bubbleSort:");

        for (int[] array : arrays) {
            long start = System.currentTimeMillis();

            SortMethods.bubbleSort(array);

            long end = System.currentTimeMillis();

            System.out.println(" Array of " + array.length + " elements: " + (end - start) + "ms");
        }
    }

    public static void mergeSortBenchmarking(int[][] arrays) {
        System.out.println("\nmergeSort:");

        for (int[] array : arrays) {
            long start = System.currentTimeMillis();

            SortMethods.mergeSort(array, 0, array.length - 1);

            long end = System.currentTimeMillis();

            System.out.println(" Array of " + array.length + " elements: " + (end - start) + "ms");
        }
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        }
    }
}

public class Scenario2 {
    public static void invoke() {
        int number = 48;
        long start = System.currentTimeMillis();
        int nthFibonacciNumber = fibonacci(number);
        long end = System.currentTimeMillis();

        System.out.println("The nth Fibonacci number for number " + number + " is " + nthFibonacciNumber);
        System.out.println("Recursive Fibonacci algorithm for " + number + " took " + (end - start) + "ms");
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

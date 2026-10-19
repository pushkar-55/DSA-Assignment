import java.util.Scanner;

public class Q14_FibonacciSeries {
    static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void printSeries(int n, int index) {
        if (index >= n) {
            return;
        }
        System.out.print(fibonacci(index));
        if (index < n - 1) {
            System.out.print(" ");
        }
        printSeries(n, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSeries(n, 0);
        System.out.println();
        sc.close();
    }
}

import java.util.Scanner;

public class Q04_PrintOddNumbers {
    static void printOdd(int n) {
        if (n < 1) {
            return;
        }
        printOdd(n - 2);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printOdd(n % 2 == 0 ? n - 1 : n);
        sc.close();
    }
}

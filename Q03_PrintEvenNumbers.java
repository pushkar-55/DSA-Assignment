import java.util.Scanner;

public class Q03_PrintEvenNumbers {
    static void printEven(int n) {
        if (n < 2) {
            return;
        }
        printEven(n - 2);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printEven(n - (n % 2));
        sc.close();
    }
}

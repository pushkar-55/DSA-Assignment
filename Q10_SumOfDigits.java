import java.util.Scanner;

public class Q10_SumOfDigits {
    static long sumDigits(long n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(sumDigits(n));
        sc.close();
    }
}

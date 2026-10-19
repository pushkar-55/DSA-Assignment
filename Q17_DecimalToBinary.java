import java.util.Scanner;

public class Q17_DecimalToBinary {
    static void toBinary(long n) {
        if (n > 1) {
            toBinary(n / 2);
        }
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        toBinary(n);
        System.out.println();
        sc.close();
    }
}

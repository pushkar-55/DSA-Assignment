import java.util.Scanner;

public class Q18_BinaryToDecimal {
    static long toDecimal(String s, int index) {
        if (index == s.length()) {
            return 0;
        }
        return (s.charAt(index) - '0') * powerOfTwo(s.length() - index - 1)
                + toDecimal(s, index + 1);
    }

    static long powerOfTwo(int n) {
        if (n == 0) {
            return 1;
        }
        return 2 * powerOfTwo(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(toDecimal(s, 0));
        sc.close();
    }
}

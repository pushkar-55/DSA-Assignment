import java.util.Scanner;

public class Q24_MinimumArrayElement {
    static int minimum(int[] a, int index) {
        if (index == a.length - 1) {
            return a[index];
        }
        return Math.min(a[index], minimum(a, index + 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(minimum(a, 0));
        sc.close();
    }
}

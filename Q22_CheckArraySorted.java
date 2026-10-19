import java.util.Scanner;

public class Q22_CheckArraySorted {
    static boolean isSorted(int[] a, int index) {
        if (index >= a.length - 1) {
            return true;
        }
        if (a[index] > a[index + 1]) {
            return false;
        }
        return isSorted(a, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(isSorted(a, 0) ? "Sorted" : "Not Sorted");
        sc.close();
    }
}

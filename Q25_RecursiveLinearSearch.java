import java.util.Scanner;

public class Q25_RecursiveLinearSearch {
    static int search(int[] a, int target, int index) {
        if (index == a.length) {
            return -1;
        }
        if (a[index] == target) {
            return index;
        }
        return search(a, target, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(search(a, target, 0));
        sc.close();
    }
}

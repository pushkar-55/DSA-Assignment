import java.util.Scanner;

public class Q26_RecursiveBinarySearch {
    static int search(int[] a, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (a[mid] == target) {
            int earlier = search(a, target, low, mid - 1);
            return earlier == -1 ? mid : earlier;
        }
        if (a[mid] < target) {
            return search(a, target, mid + 1, high);
        }
        return search(a, target, low, mid - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(search(a, target, 0, n - 1));
        sc.close();
    }
}

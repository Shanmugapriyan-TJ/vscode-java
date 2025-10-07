import java.util.Scanner;

public class shorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int min = a[0];
        for (int i = 1; i < n; i++) min = Math.min(min, a[i]);

        boolean sorted = true;
        for (int i = 0; i < n; i++) {
            if (a[i] - k > min + k) { // cannot adjust this element to be in range
                sorted = false;
                break;
            }
        }

        System.out.println(sorted ? "YES" : "NO");
        sc.close();
    }
}

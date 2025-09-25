import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of friends
        int h = sc.nextInt(); // height of the fence

        int width = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); // height of friend i
            if (a > h) {
                width += 2; // friend needs width 2
            } else {
                width += 1; // friend needs width 1
            }
        }

        System.out.println(width);
        sc.close();
    }
}

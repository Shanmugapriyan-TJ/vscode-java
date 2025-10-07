import java.util.Scanner;

public class businout{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int current = 0;
        int capacity = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();  // number of people exiting
            int b = sc.nextInt();  // number of people entering
            current -= a;
            current += b;
            if (current > capacity) {
                capacity = current;
            }
        }
        System.out.println(capacity);
        sc.close();
    }
}

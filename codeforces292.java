import java.util.Scanner;

public class codeforces292{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String target = "codeforces";
        while (t-- > 0) {
            String s = sc.next();
            int diff = 0;
            for (int i = 0; i < 10; i++) {
                if (s.charAt(i) != target.charAt(i)) {
                    diff++;
                }
            }
            System.out.println(diff);
        }
        sc.close();
    }
}

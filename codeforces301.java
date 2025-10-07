import java.util.*;

public class codeforces301{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<String> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            if (seen.contains(name)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                seen.add(name);
            }
        }
    }
}

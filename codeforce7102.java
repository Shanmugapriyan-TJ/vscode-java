import java.util.Scanner;

public class codeforce7102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        sc.close();
        
        long tilesAlongN = (n + a - 1) / a;
        long tilesAlongM = (m + a - 1) / a;
        long result = tilesAlongN * tilesAlongM;
        
        System.out.println(result);
    }
}

import java.util.Scanner;

public class codeforces293{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            String b = sc.next();   
            int n = b.length();
            
            StringBuilder a = new StringBuilder();
            
            
            a.append(b.charAt(0));
            
           
            for (int i = 1; i < n - 1; i += 2) {
                a.append(b.charAt(i));
            }
            
            
            a.append(b.charAt(n - 1));
            
            System.out.println(a.toString());
        }
        
        sc.close();
    }
}

import java.util.Scanner;
public class code2 {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int days = sc.nextInt();
            int year = days / 365;
           int week = (days % 365)/7;
           int day = week % 7;
            System.out.println(year);
            System.out.println(week);
            System.out.println(day);
        }


    
}
       
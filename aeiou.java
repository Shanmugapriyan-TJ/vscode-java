import java.util.Scanner;

public class aeiou{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine().toLowerCase();
        int vowels = 0;

        for (char c : phrase.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            }
        }

        // Example condition: YES if number of vowels is even, else NO
        if (vowels % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

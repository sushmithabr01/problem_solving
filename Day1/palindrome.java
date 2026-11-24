import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int reverse = 0;

        if (n < 0) {
            System.out.println("Not a Palindrome");
        } else {
            while (n > 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n = n / 10;
            }

            if (original == reverse) {
                System.out.println("Palindrome Number");
            } else {
                System.out.println("Not a Palindrome");
            }
        }

        sc.close();
    }
}

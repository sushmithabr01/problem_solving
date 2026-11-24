import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size");
            sc.close();
            return;
        }

        int arr[] = new int[n];

        int min, max;
        double sum = 0;

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        min = arr[0];
        max = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        double average = sum / n;

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + average);

        sc.close();
    }
}

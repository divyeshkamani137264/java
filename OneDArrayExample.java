import java.util.Scanner;

public class OneDArrayExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declare 1D array
        int[] numbers = new int[5];

        // Taking array elements from user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // Display array elements
        System.out.println("Elements of 1D Array are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}

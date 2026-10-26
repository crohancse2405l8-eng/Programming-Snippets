import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = 1;

            for (int i = 1; i <= n; i++) {
                result *= i;
            }

            System.out.println("Factorial: " + result);
        }

        sc.close();
    }
}

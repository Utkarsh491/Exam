import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        long fact = 1;

        for (int i = 1; i <= n; ++i) {
            fact *= i;
        }
        System.out.printf("Factorial of %d = %d", n, fact);
        sc.close();
    }
}

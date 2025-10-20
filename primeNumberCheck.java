import java.util.Scanner;

public class primeNumberCheck {

    // define a function to check prime or not
    public static void checkPrime(int n) {
        if (n <= 1) {
            System.out.println("The number " + n + " is not prime");
            return;
        }
        if (n == 2) {
            System.out.println("The number " + n + " is prime");
            return;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("The number " + n + " is not prime");
                return;
            }
        }

        System.out.println("The number " + n + " is prime");
    }

    public static void main(String[] args) {
        // taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number : ");

        int n = sc.nextInt();
        checkPrime(n);
        sc.close();
    }

}

import java.util.Scanner;

public class primeNumberCheck {


    // define a function to check prime or not
    public static void checkPrime(int n) {
        boolean checkPrime = true;

        if (n == 2) {
            System.out.println("n is prime");
        }

        else {

            for(int i=2; i<=n-1; i++) {
                if( n % i == 0) {
                    checkPrime = false;
                }
            }
            if (checkPrime == true) {
                    System.out.println("The number " + n + " is prime");
                    
                } else {
                    System.out.println("The number " + n + " is not prime");
                    
                }
        }

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

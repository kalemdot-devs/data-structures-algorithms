package FunctionQues;
import java.util.Scanner;


public class CheckPalindrome {

    // define a function to check a palindrome num;
    public static boolean isPalindrome(int num) {
        int reverse = 0;
        while (num != 0) {
            int lastDigit = num % 10; // get last digit or remender
            reverse = lastDigit * 10 + lastDigit;
            num = num / 10;
        }

        if (num == reverse) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int palindrome = sc.nextInt();
        if (isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome");
        }
        else {
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }
        sc.close();
    }

     
}
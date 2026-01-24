package FunctionQues;
// import java.util.*;


// calculate the sum of digits in an integer
public class SumInDigits {
    
    public static void integerSum(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n%10; // get last digit
            // sum += lastDigit;
            sum = sum + lastDigit;
            n = n / 10; // remove lastdigit
        }

        System.out.println("sum of integer : " + sum);

    }

    public static void main(String[] args) {
        integerSum(10);
    }
}

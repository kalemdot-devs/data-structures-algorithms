import java.util.Scanner;

public class Functions {
    
    // calculate the sum of two numbers using function
    public static int calculateSum(int num1, int num2) { // parameters or formal parameters/dummy params
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("enter 2nd number : ");
        int num2 = sc.nextInt();

        int sum = calculateSum(num1, num2); // arguments or actuall parameters or original values
        System.out.println("sum of 2 number is : " + sum);
        sc.close();


    }   
}

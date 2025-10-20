<<<<<<< HEAD
import java.util.Scanner;

public class EvenOddNumbersSum {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter your numbers : ");
        // int num = sc.nextInt();
        // int evenSum = 0;
        // int oddSum = 0;

        // while (num > 0) {
        //     if (num%2 == 0) {
        //         evenSum += num;
        //     } else {
        //         oddSum += num;
        //     }

        //     num--;

        // }

        // System.out.println("sum of even numbers : " + evenSum);
        // System.out.println("sum of odd numbers : " + oddSum);

        // sc.close();
        


        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number count : ");
        int n = sc.nextInt();
        int evenSum = 0; 
        int oddSum = 0;

        for(int i=1; i<n; i++) {
            System.out.println("enter your number : ");
            int num = sc.nextInt();
            if(num%2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        sc.close();
        System.out.println("sum of even numbers : " + evenSum);
        System.out.println("sum of odd numbers : " + oddSum);
    }
}




=======
import java.util.Scanner;

public class EvenOddNumbersSum {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter your numbers : ");
        // int num = sc.nextInt();
        // int evenSum = 0;
        // int oddSum = 0;

        // while (num > 0) {
        //     if (num%2 == 0) {
        //         evenSum += num;
        //     } else {
        //         oddSum += num;
        //     }

        //     num--;

        // }

        // System.out.println("sum of even numbers : " + evenSum);
        // System.out.println("sum of odd numbers : " + oddSum);

        // sc.close();
        


        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number count : ");
        int n = sc.nextInt();
        int evenSum = 0; 
        int oddSum = 0;

        for(int i=1; i<n; i++) {
            System.out.println("enter your number : ");
            int num = sc.nextInt();
            if(num%2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        sc.close();
        System.out.println("sum of even numbers : " + evenSum);
        System.out.println("sum of odd numbers : " + oddSum);
    }
}




>>>>>>> backup-recovery

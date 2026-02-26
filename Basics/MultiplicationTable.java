import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number : ");
        int n = sc.nextInt();
        System.out.println("table of " + n);
       
        for(int i=1; i<=n; i++) {
            System.out.println(n + " x " + i + " = " + i*n );

        }
        sc.close();

    }
}

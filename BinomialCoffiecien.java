public class BinomialCoffiecien {

    public static int factorial(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact *= i;
        } 

        return fact;
    }
    
    public static int BioCoeffie(int n, int r) {

        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        
        int BioCoffi = n_fact / (r_fact * nmr_fact);
        return BioCoffi;

    }
    
    public static void main(String[] args) {
        System.out.println(BioCoeffie(5, 2));
    }
}

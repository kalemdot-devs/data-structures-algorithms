// Check prime number in a given range. with optimized approach;

public class PrimeInRange {

    public static boolean isPrime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
                
            }
        }
        return true;
    }
    
    // prime within range
    public static void PrimeNumRange(int n) {
        for(int i=2; i<n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
                
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // System.out.println();
        PrimeNumRange(10);
    }
}

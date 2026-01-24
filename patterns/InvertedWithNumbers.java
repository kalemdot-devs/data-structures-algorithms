package patterns;

public class InvertedWithNumbers {

    // inverted half paramid with numbers
    public static void inverted_half_paramid_withNumbers(int n) {
        // outer loop -> lines/rows
        for(int i=1; i<=n; i++){
            // inner loop -> cols
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_half_paramid_withNumbers(5);
    }
    
}

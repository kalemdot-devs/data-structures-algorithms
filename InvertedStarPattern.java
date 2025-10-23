public class InvertedStarPattern {
    public static void main(String[] args) {
        // outer loops for number of lines in pattern
        int n = 7;
        for (int line = 1; line<=n; line++) {

            // inner loops for printing start logic 
            for(int star=1; star<=(n-line+1); star++) {
                System.out.print("*");
            }

            // newline outside the loop 
            System.out.println();
            
        }
    }
    
}

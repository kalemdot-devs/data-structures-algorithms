public class LeftHalfParamid {
    public static void main(String[] args) {
        // number of lines in paramid -> n;
        int n = 5;

        // outer loop for number of lines in paramid/pattern
        for (int i = 1; i <=n; i++) {

            // inner loop for number of stars
            for (int j = 1; j <=i; j++) {

                // what to print/show
                System.out.print("*");
                
            }

            System.out.println();
            
        }
    }
    
}

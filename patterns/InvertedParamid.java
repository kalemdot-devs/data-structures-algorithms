package patterns;

public class InvertedParamid {
    // outer loops rows ky liye
    public static void inverted_rotated_half_paramid(int n) {
        for (int i=1; i<=n; i++) {

            // spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            // empty line
            System.out.println();
        }
    }

    // main function
    public static void main(String[] args) {
        inverted_rotated_half_paramid(7);
    }

}

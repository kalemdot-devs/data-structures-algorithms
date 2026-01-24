public class JavaBasics {

    // public static void calcAvg(int a, int b, int c) {
    //     int iniAvg = 0;
    //     iniAvg = (a + b + c) / 3;
    //     System.out.println("Average of 3 number : " + iniAvg);
    // }

    // public static boolean isEven(int n) {
    //     // check for even
    //     if(n % 2 == 0) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }


    // Hollow Rectangle pattern 1
    // public static void hollow_rect(int totRows, int totCols){
    //     int n = 4;
    //     for(int i=1; i<=totRows; i++){
    //         for(int j=1; j<=totCols; j++){
    //             if(i==1 || j==1 || i==totRows || j==totCols){
    //                 System.out.print("*");
    //             } else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // inverted rotated rectangle
    public static void inverted_rot_rect(int n){
        // outer loop
        for(int i=1;i<=n; i++){
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        // calcAvg(12, 5, 8);
        // boolean checkNum = isEven(46);
        // System.out.println(checkNum);

        // hollow_rect(6, 6);
        inverted_rot_rect(5);
    }
}
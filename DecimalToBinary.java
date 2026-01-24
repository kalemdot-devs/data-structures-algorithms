public class DecimalToBinary {
    

    // convert Decimal to Binary
    public static void deciToBinary(int decNum) {
        int myNum = decNum;
        int powr = 0;
        int binNumb = 0;

        while (decNum > 0) {
            int remender = decNum % 2;
            // applying formula 
            binNumb = binNumb + (remender * (int)Math.pow(10, powr));

            decNum = decNum / 2;
            powr++;
        }
        System.out.println("Binary of decimal -> " + myNum + " = " + binNumb);
    }

    public static void main(String[] args) {
        deciToBinary(10);
    }
}


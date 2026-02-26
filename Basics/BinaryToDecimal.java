public class BinaryToDecimal {

    // convert binary to decimal 
    public static void binToDecimal(int binNum) {
        int orgBinNum = binNum;
        int powr = 0;
        int decimalNum = 0;
        while (binNum > 0) {
            // formula
            // decimal = decimal + (LD * 2.power)
            int lastDigit = binNum % 10;
            decimalNum = decimalNum + (lastDigit * (int)Math.pow(2, powr));
            binNum = binNum/10;
            powr++;
        }
        System.out.println("Decimal of Binary -> " + orgBinNum + " = " + decimalNum);

    }

    public static void main(String[] args) {
        binToDecimal(111);
    }
    
}

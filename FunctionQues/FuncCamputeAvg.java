package FunctionQues;

public class FuncCamputeAvg {
    public static double calculateAverage(double a, double b, double c) {
        double averageValue = (a + b + c) / 3;
        return averageValue;
    }

    public static void main(String[] args) {
       System.out.println("The average value is : " +  calculateAverage(4, 9, 19));
    }
    
}

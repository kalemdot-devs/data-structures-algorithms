package arrays;

// find sub array in a given array
// public class FindSubArray {
//     public static void printSubArray(int numbers[]){
//         int sum = 0;
//         for(int i=0;i<numbers.length; i++){
//             int start = i;
//             for(int j=i; j<numbers.length; j++){
//                 int end = j;
//                 for(int k=start; k<=end; k++){
//                     System.out.print("[" + numbers[k] + "]" + "");
//                     sum += numbers[k];
//                 }
//                 System.out.println();
//             }
//         }
//         System.out.println("The sum of sub array is : " + sum);
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         printSubArray(numbers);
//     }

// }

// Maximum sub array sum 

public class FindSubArray {
    public static void maxArraySum(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                currentSum = 0;
                for(int k=i; k<=j; k++){
                    currentSum += numbers[k];
                    if(currentSum > maxSum){
                        maxSum = currentSum;
                    }
                    System.out.println(currentSum);
                    
                }
            }
        }
        System.out.println("Maximum sum of all sub array : " + maxSum);
    }

    public static void main(String[] args) {
        // int number[] = {1, -2, 6,-1,3};
        int number[] = {2, 4, 6,8,10};
        maxArraySum(number);
    }
}
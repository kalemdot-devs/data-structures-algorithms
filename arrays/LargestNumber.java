package arrays;
import java.util.*;

public class LargestNumber {
    // Largest in Array
    // public static int getLargest(int numbers[]){
    //     int largest = Integer.MIN_VALUE; // - infinti
    //     for(int i=0; i<numbers.length; i++){
    //         if (largest < numbers[i]) {
    //             largest = numbers[i];
    //         }
            
    //     }
    //     return largest;
    // }

    public static int binarySearch(int numbers[], int key){
        // Binary Search in Array
        int start = 0, end = numbers.length - 1;
        
        // loop through array
        while(start <= end) {
            // find mid 
            int mid = (start + end) / 2; // found key
            
            // comparision
            if(numbers[mid] == key) { // found
                return mid;
            }
            if (numbers[mid] > key) { // search for right
                end = mid-1;

            } else { // search for left 
                start = mid+1;

            }

        } 
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = {2, 6, 3, 5, 4, 10, 12, 16};
        int key = 3;
        int indx = binarySearch(numbers, key);
        System.out.println(indx);
        // int largest = getLargest(numbers);
        // System.out.println("The largest is : " + largest);
    }
}

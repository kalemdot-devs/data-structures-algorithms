package arrays;

public class BinarySearch {
    
    public static int binarySearch(int numbers[], int key) {
        // let's first initialize start and end vlaue in array
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // System.out.println("mid value of the given array is : " + mid);
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args ) {
        int numbers[] = {2, 4, 6, 10, 14, 20, 16, 18};
        int key = 22;
        int index = binarySearch(numbers, key);
        if (index == -1){
            System.out.println("key not found : " + index);
        } else{
            System.err.println("key found at index : " + index);
        }

    }
}

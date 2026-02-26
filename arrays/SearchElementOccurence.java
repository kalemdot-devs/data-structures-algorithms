package arrays;

public class SearchElementOccurence {
    // find first and last occurence in a sorted array

    public static int firstOcc(int arr[], int key){
        int start = 0, end = arr.length - 1;
        
        int mid = start + (end - start) / 2; // smart -> chalaki se
        int ans = -1;
        while (start <= end) { // loop chlao jab tak start end se chota ya equal hai

            if (arr[mid] == key) { // ans ko store karo aur end mid ko - karo
                ans = mid;
                end = mid - 1;
            }

            else if (key > arr[mid]) { // right me jao;
                start = mid + 1;        
            }
            else { // left ma jao
                end = mid - 1;
            }
            mid = start + (end - start) / 2; // mid ko update karo
            
        }
        return ans;
    }

    public static int lastOcc(int arr[], int key){
        // search for last occurrence
        int start = 0, end = arr.length -1 ;
        int lastIndex = -1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (arr[mid] == key) {
                lastIndex = mid;
                start = mid + 1;
            }
            else if(key > arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return lastIndex;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 3, 5};
        int key = 9;
        int firstIndex = firstOcc(arr, key);
        System.out.println("first occurrence of : " + key + " is at index : " + firstIndex);
        // last Occurrence
        int lastIndex = lastOcc(arr, key);
        System.out.println("last occurrence of : " + key + " is at index : " + lastIndex);
    }
}

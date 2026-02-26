package arrays;
import java.math.*;


public class TrappingRainwater {
    // two pointer approach
    // public static int trapWater(int height[]) {
    //     int n = height.length;
    //     int left = 0;
    //     int right = n - 1;
    //     int ans = 0;
    //     int leftMax = height[left]; // calculate left max boundary
    //     int rightMax = height[right]; // calculate right max boudary
    //     while (left < right) {
    //         if (height[left] < height[right]) {
    //             leftMax = Math.max(leftMax, height[left]);
    //             ans += leftMax - height[left];
    //             left++;
    //         } else {
    //             rightMax = Math.max(rightMax, height[right]);
    //             ans += rightMax - height[right];
    //             right--;
    //         }
    //     }
    //     return ans;
    // }

    public static int trapWater2(int height[]) {
        // calculate left max boundary
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trapedWater = 0;
        // loop
        for(int i=0; i<n; i++){
            // water level = min(lmax, rmax);
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // traped rain water
            trapedWater += waterLevel - height[i];
        }
        return trapedWater;
        
    }

    public static void main(String[] args) {
        // int height[] = {3, 0, 1, 0, 4, 0, 2};
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        // int ans = trapWater(height);
        int ans = trapWater2(height);
        System.out.println("Water traped is : " + ans);
    }
}
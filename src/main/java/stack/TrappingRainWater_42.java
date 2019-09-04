package stack;

import java.util.Stack;

public class TrappingRainWater_42 {
    public int trap(int[] height) {
        int left = 0;
        int left_max = 0;
        int right = height.length-1;
        int right_max = 0;
        int res = 0;
        while (left < right){
            if (height[left] < height[right]){
                if (left_max < height[left])
                    left_max = height[left];
                else
                    res = res + (left_max - height[left]);

                left++;
            }
            else{
                if (right_max < height[right])
                    right_max = height[right];
                else
                    res = res + (right_max - height[right]);

                right--;
            }
        }
        return res;
    }
}

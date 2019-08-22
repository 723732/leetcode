package dp;
//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//
//        示例:
//
//        输入: [-2,1,-3,4,-1,2,1,-5,4],
//        输出: 6
//        解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

public class MaximumSubarray_53 {
    //暴力
//    执行用时 :151 ms, 在所有 Java 提交中击败了5.03%的用户
//    内存消耗 :43 MB, 在所有 Java 提交中击败了43.70%的用户
    public int maxSubArray(int[] nums) {
        if (nums.length < 1)
            return 0;
        int result = nums[0];
        for (int i = 0; i < nums.length; i++){
            int sum = nums[i];
            int tmp = nums[i];
            for (int j = i+1; j < nums.length; j++){
                sum = sum + nums[j];
                tmp = Math.max(tmp, sum);
            }
            result = Math.max(result, tmp);
        }
        return result;
    }
}

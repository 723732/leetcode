package dp.knapsack;
//416. 分割等和子集
//        给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
//
//        注意:
//
//        每个数组中的元素不会超过 100
//        数组的大小不会超过 200
//        示例 1:
//
//        输入: [1, 5, 11, 5]
//
//        输出: true
//
//        解释: 数组可以分割成 [1, 5, 5] 和 [11].
//
//
//        示例 2:
//
//        输入: [1, 2, 3, 5]
//
//        输出: false
//
//        解释: 数组不能分割成两个元素和相等的子集.
public class PartitionEqualSubsetSum_416 {
    //挑选出一个数组，其和为数组所有数的和的一半
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num: nums){
            sum = sum + num;
        }

        int tar = sum/2;
        int len = nums.length;
        int[][] dp = new int[len+1][tar+1];
        for (int i = 1; i < len+1; i++){
            for (int j = 1; j <= tar; j++){//背包的容量
                if (nums[i-1] > j)
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-nums[i-1]] + nums[i-1]);
            }
        }

        return true;
    }
}

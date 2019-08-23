package dp;
//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
//        每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//
//        注意：给定 n 是一个正整数。
//
//        示例 1：
//
//        输入： 2
//        输出： 2
//        解释： 有两种方法可以爬到楼顶。
//        1.  1 阶 + 1 阶
//        2.  2 阶

public class ClimbingStairs_70 {
    public int climbStairs(int n) {
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        if(n < 2)
            return nums[n];
        nums[2] = 2;
        for(int i = 3; i < n+1; i++){
            nums[i] = nums[i-1] + nums[i-2];
        }

        return nums[n];
    }
}

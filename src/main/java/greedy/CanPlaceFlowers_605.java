package greedy;
//605. 种花问题
//
//        假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
//
//        给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。能否在不打破种植规则的情况下种入 n 朵花？能则返回True，不能则返回False。
//
//        示例 1:
//
//        输入: flowerbed = [1,0,0,0,1], n = 1
//        输出: True
//        示例 2:
//
//        输入: flowerbed = [1,0,0,0,1], n = 2
//        输出: False
//        注意:
//
//        数组内已种好的花不会违反种植规则。
//        输入的数组长度范围为 [1, 20000]。
//        n 是非负整数，且不会超过输入数组的大小。

public class CanPlaceFlowers_605 {
    //dp[i][0]表示在i位置不种花还有剩余m盆花没有种
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean res = false;
        int len = flowerbed.length;
        if (len == 1)
            return flowerbed[0] == 1 && n == 1 ? false : true;
        int[] dp = new int[len];
        for (int i = 0; i < len; i++){
            dp[i] = -1;
        }
        if (flowerbed[0] == 0 && flowerbed[1] == 0)
            dp[0] = n - 1;
        else dp[0] = n;
        if (flowerbed[0] == 0 && flowerbed[1] == 0 && flowerbed[2] == 0)
            dp[1] = n - 1;
        else dp[1] = n;
        for (int i = 2; i < len; i++){
            if (flowerbed[i] == 0)
                dp[i] = dp[i-2] - 1;

            if (dp[i] == 0){
                res = true;
                break;
            }

        }
        return res;
    }
}

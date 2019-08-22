package dp;
//给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
//
//        如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
//
//        注意你不能在买入股票前卖出股票。
//
//        示例 1:
//
//        输入: [7,1,5,3,6,4]
//        输出: 5
//        解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
//        注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。

public class BestTimetoBuyandSellStock121 {
    //暴力
    public int maxProfit(int[] prices) {
        int result = 0;
        if (prices.length < 2)
            return result;
        for (int i = 0; i < prices.length-1; i++){
            for (int j = i+1; j < prices.length; j++){
                if (prices[j] > prices[i])
                    result = Math.max(result, prices[j]-prices[i]);
            }
        }
        return result;
    }

    //保留最小的买入执行用时 :3 ms;在所有 Java 提交中击败了79.37%的用户
    //内存消耗 :38.4 MB在所有 Java 提交中击败了49.27%的用户
    public int maxProfit1(int[] prices) {
        int result = 0;
        if (prices.length < 2)
            return result;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++){
            result = Math.max(result, prices[i]-min);
            min = Math.min(min, prices[i]);
        }
        return result;
    }
}

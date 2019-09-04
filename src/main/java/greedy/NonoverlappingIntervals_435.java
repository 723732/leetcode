package greedy;
//435. 无重叠区间
//        给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
//
//        注意:
//
//        可以认为区间的终点总是大于它的起点。
//        区间 [1,2] 和 [2,3] 的边界相互“接触”，但没有相互重叠。
//        示例 1:
//
//        输入: [ [1,2], [2,3], [3,4], [1,3] ]
//
//        输出: 1
//
//        解释: 移除 [1,3] 后，剩下的区间没有重叠。
//        示例 2:
//
//        输入: [ [1,2], [1,2], [1,2] ]
//
//        输出: 2
//
//        解释: 你需要移除两个 [1,2] 来使剩下的区间没有重叠。
//        示例 3:
//
//        输入: [ [1,2], [2,3] ]
//
//        输出: 0
//
//        解释: 你不需要移除任何区间，因为它们已经是无重叠的了。

import java.util.Arrays;
import java.util.Comparator;

public class NonoverlappingIntervals_435 {
    //贪心,按照区间中后一个数将区间进行排序，如果新加入的区间大于之前的区间或者和之前区间有重叠部分，则不加入
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0)
            return 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int cur = intervals[0][1];
        int count = 1;
        for (int i = 1; i < intervals.length; i++){
            if (intervals[i][0] >= cur){
                count++;
                cur = intervals[i][1];
            }
        }

        return intervals.length - count;
    }

    //动态规划
    public int eraseOverlapIntervals1(int[][] intervals){
        int len = intervals.length;
        if (len == 0)
            return 0;
        int[] dp = new int[len];//在加入第i个区间后有多少个区间没有重叠
        dp[0] = 1;
        int ans = 1;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int i = 1; i < len; i++){
            int tmp = 0;
            for (int j = 0; j < i; j++){
                if (intervals[j][1] <= intervals[i][0]){//没重叠
                    tmp = Math.max(dp[j],tmp);
                }
            }
            dp[i] = tmp + 1;
            ans = Math.max(dp[i], ans);//加入第i个区间和不加第i个区间看哪种情况区间数多
        }

        return len - ans;
    }
}

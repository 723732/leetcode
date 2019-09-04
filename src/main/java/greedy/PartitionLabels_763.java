package greedy;
//763. 划分字母区间
//        字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一个字母只会出现在其中的一个片段。返回一个表示每个字符串片段的长度的列表。
//
//        示例 1:
//
//        输入: S = "ababcbacadefegdehijhklij"
//        输出: [9,7,8]
//        解释:
//        划分结果为 "ababcbaca", "defegde", "hijhklij"。
//        每个字母最多出现在一个片段中。
//        像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
//        注意:
//
//        S的长度在[1, 500]之间。
//        S只包含小写字母'a'到'z'。

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels_763 {
    //每遍历一个字符寻找这个字符下一次出现的位置
    //如果字符出现的最后一个位置大于或等于前一个字符串的结尾
    public List<Integer> partitionLabels(String S) {
        int len = S.length();
        char[] s = new char[len];
        for (int i = 0; i < len; i++){
            s[i] = S.charAt(i);
        }

        List<Integer> res = new ArrayList<>();
        int start = 0;//当前统计长度字符串的开头；
        int end = 0;//结尾
        for (int i = 0; i < len; i++){
            int next = S.indexOf(s[i], i+1);//字符出现的最后位置
            if (next == -1 && i >= end){
                //这个字符是最后一次出现且此字符之前的字符在i位置之后都不存在，这个位置是分割点
                res.add(i - start + 1);
                start = i + 1;
            }
            else{
                if (next > end)
                    end = next;
            }
        }

        return res;
    }
}

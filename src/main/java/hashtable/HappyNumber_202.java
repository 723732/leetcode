package hashtable;
//202. 快乐数
//        编写一个算法来判断一个数是不是“快乐数”。
//
//        一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
//
//        示例:
//
//        输入: 19
//        输出: true
//        解释:
//        12 + 92 = 82
//        82 + 22 = 68
//        62 + 82 = 100
//        12 + 02 + 02 = 1

import java.util.ArrayList;
import java.util.List;

public class HappyNumber_202 {
    public boolean isHappy(int n){
        List<Integer> nums = new ArrayList<>();
        while (n != 1 && !nums.contains(n)){
            nums.add(n);
            int tmp = 0;
            while (n != 0){
                int a = n%10;
                tmp = tmp + a*a;
                n = n/10;
            }
            n = tmp;
        }

        if (n == 1)
            return true;
        else
            return false;
    }
}

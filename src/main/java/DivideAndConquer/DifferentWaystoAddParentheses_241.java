package DivideAndConquer;
//241. 为运算表达式设计优先级
//        给定一个含有数字和运算符的字符串，为表达式添加括号，改变其运算优先级以求出不同的结果。你需要给出所有可能的组合的结果。有效的运算符号包含 +, - 以及 * 。
//
//        示例 1:
//
//        输入: "2-1-1"
//        输出: [0, 2]
//        解释:
//        ((2-1)-1) = 0
//        (2-(1-1)) = 2
//        示例 2:
//
//        输入: "2*3-4*5"
//        输出: [-34, -14, -10, -10, 10]
//        解释:
//        (2*(3-(4*5))) = -34
//        ((2*3)-(4*5)) = -14
//        ((2*(3-4))*5) = -10
//        (2*((3-4)*5)) = -10
//        (((2*3)-4)*5) = 10

import java.util.ArrayList;
import java.util.List;

public class DifferentWaystoAddParentheses_241 {
    //分治法
    //根据运算符将字符串分为左右两部分分别计算结果，再将两个结果进行相应的运算
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*'){
                List<Integer> lefts = diffWaysToCompute(input.substring(0, i));
                List<Integer> rights = diffWaysToCompute(input.substring(i));

                for (int left: lefts){
                    for (int right: rights){
                        if (input.charAt(i) == '+')
                            result.add(left + right);
                        else if (input.charAt(i) == '-')
                            result.add(left - right);
                        else if (input.charAt(i) == '*')
                            result.add(left * right);
                    }
                }
            }
        }
        //如果分出的子字符串不含运算符，即停止（不含运算符的话result长度为零）
        if (result.size() == 0)
            result.add(Integer.valueOf(input));

        return result;
    }
}

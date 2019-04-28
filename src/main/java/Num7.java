//7. Reverse Integer
//        Given a 32-bit signed integer, reverse digits of an integer.
//
//        Example 1:
//
//        Input: 123
//        Output: 321
//        Example 2:
//
//        Input: -123
//        Output: -321
//        Example 3:
//
//        Input: 120
//        Output: 21
//        Note:
//        Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
public class Num7 {
    public int reverse(int x){
        String s = String.valueOf(x);
        String res = "";
        int i = 0;

        if(i == 0 && s.charAt(0) == '-'){
            i = i + 1;
            res = res + s.charAt(0);
        }

        for(int tmp = s.length() - 1; tmp > i - 1; tmp--){
            res = res + s.charAt(tmp);
        }

        int i_res = 0;
        try{
            i_res = Integer.parseInt(res);
        }catch (Exception e){
            return 0;
        }

        return i_res;
    }
}

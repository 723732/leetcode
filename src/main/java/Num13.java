import java.util.HashMap;
import java.util.Map;

public class Num13 {
    public int romanToInt(String s){
        char[] symbol = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] value = {1, 5, 10, 50, 100, 500, 1000};

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < symbol.length; i++)
            map.put(symbol[i], value[i]);

        int j = s.length();
        int num = map.get(s.charAt(j-1));
        for (int i = j-1; i > 0; i--){
            if (map.get(s.charAt(i-1)) < map.get(s.charAt(i)))
                num = num - map.get(s.charAt(i-1));
            else
                num = num + map.get(s.charAt(i-1));
        }
        return num;
    }
}
//从后向前遍历
//执行用时 : 34 ms, 在Roman to Integer的Java提交中击败了70.93% 的用户
//        内存消耗 : 40.8 MB, 在Roman to Integer的Java提交中击败了71.82% 的用户
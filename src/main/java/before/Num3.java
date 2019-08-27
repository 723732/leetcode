package before;

import java.util.HashMap;
import java.util.Map;

//3. Longest Substring Without Repeating Characters
//
//        Given a string, find the length of the longest substring without repeating characters.
//
//        Example 1:
//
//        Input: "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
//        Example 2:
//
//        Input: "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.
//        Example 3:
//
//        Input: "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
//        Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

public class Num3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Integer, Character> map1 = new HashMap<>();
        Map<Integer, Character> map2 = new HashMap<>();

        int temp = 0;

        for(int i = 0; i < s.length(); i++){
            if(!map1.containsValue(s.charAt(i)))
                map1.put(i, s.charAt(i));
            else{
                map2.put(i, s.charAt(i));
                int j = i-1;
                while(map1.get(j) != map2.get(i)){
                    map2.put(j, map1.get(j));
                    j = j - 1;
                }
                map1.clear();
                map1.putAll(map2);
                map2.clear();
            }

            if(temp < map1.size())
                temp = map1.size();
        }

        return temp;
    }
}
//开始没有考虑到最长字串是其本身
//一旦发现重复字符出现，删除的应该是重复字符及其之前的字符
//执行用时和内存消耗都太大
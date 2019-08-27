package before;

import java.util.ArrayList;
import java.util.Collections;

public class Num14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        if(strs.length == 1)
            return strs[0];

        ArrayList<Integer> len = new ArrayList<>();
        for (int i = 0; i < strs.length; i++){
            len.add(strs[i].length());
        }

        Collections.sort(len);

        int k = 0;
        while(k < len.get(0)){
            for (int i = 1; i < strs.length; i++){
                if(strs[i].charAt(k) != strs[i-1].charAt(k))
                    if(k > 0)
                        return strs[i].substring(0, k);
                    else
                        return "";
            }
            k++;
        }
        return  strs[0].substring(0, k);
    }
}

//执行用时 : 5 ms, 在Longest Common Prefix的Java提交中击败了67.62% 的用户
//        内存消耗 : 35.3 MB, 在Longest Common Prefix的Java提交中击败了91.35% 的用户

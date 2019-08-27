package before;

import java.util.ArrayList;
import java.util.List;

public class Num17 {
    public List<String> letterCombinations(String digits) {
        String[] letter = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};


        List<String> tmp = new ArrayList<String>();
        List<String> tmp1 = new ArrayList<String>();

        if (digits.length() == 0 || digits == null)
            return tmp1;
        if (digits.length() == 1){
            int k = 0;
            while (k < letter[digits.charAt(0) - 48 - 2].length()){
                tmp1.add(String.valueOf(letter[digits.charAt(0) - 48 - 2].charAt(k)));
                k++;
            }
            return tmp1;
        }


        String start = letter[digits.charAt(0) - 48 - 2];
        String start1 = letter[digits.charAt(1) - 48 - 2];

        int j = 0;
        while (j < start.length()){
            int k = 0;
            while (k < start1.length()){
                String c = String.valueOf(start.charAt(j)) + start1.charAt(k);
                tmp1.add(c);
                k++;
            }
            j++;
        }

        if (digits.length() > 2){
            int i = 2;
            while (i < digits.length()){
                String get = letter[digits.charAt(i) - 48 - 2];
                for (String a: tmp1) {
                    int k = 0;
                    while (k < get.length()){
                        String b = a + get.charAt(k);
                        tmp.add(b);
                        k++;
                    }
                }
                tmp1.clear();
                tmp1.addAll(tmp);
                tmp.clear();
                i++;
            }

        }

        return tmp1;
    }
}
//执行用时 : 2 ms, 在Letter Combinations of a Phone Number的Java提交中击败了80.06% 的用户
//        内存消耗 : 35.3 MB, 在Letter Combinations of a Phone Number的Java提交中击败了84.89% 的用户
//5. Longest Palindromic Substring
//
//        Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//
//        Example 1:
//
//        Input: "babad"
//        Output: "bab"
//        Note: "aba" is also a valid answer.
//        Example 2:
//
//        Input: "cbbd"
//        Output: "bb"


public class Num5 {
    public String longestPalindrome(String s) {
        if(s == null || s.isEmpty())
            return "";

        String temp = "";
        String longPalindrome = "";
        for(int i = 0; i < s.length(); i++)
            for(int j = s.length(); j > 0; j--){
                temp = s.substring(i, j);
                if(longPalindrome.length() >= temp.length())
                    break;

                if(temp.equals(reverseString(temp)) && temp.length() > longPalindrome.length()){
                    longPalindrome = temp;
                    break;
                }
        }

        return longPalindrome;
    }

    //得到字符串的反转
    public String reverseString(String s){
        String rstring = "";

        for(int i = s.length() - 1; i >= 0; i--){
            rstring = rstring + s.charAt(i);
        }
        return  rstring;
    }

    public String longestPalindrome1(String s){
        int begin = 0;
        int end = 0;
        int i = 0;
        String longPalindrome = "";

        if(s == null || s.isEmpty())
            return "";

        if(s.length() == 1 || s.length() == 2)
            return s;

        while(i < s.length()) {
            for (int j = s.length()-1; j > i; j--) {
                if(s.charAt(i) == s.charAt(j)){
                    if(begin == 0 && end == 0){
                        begin = i;
                        end = j + 1;
                    }

                    if(i == j || j == i+1){
                        longPalindrome = s.substring(begin, end);
                        return longPalindrome;
                    }
                    break;
                }
                else{
                    begin = 0;
                    end = 0;
                }




//                if (i > j - 1) {
//                    i++;
//                    break;
//                }
//
//                if (i == j - 1 && (begin != 0 || end != 0)) {
//                    longPalindrome = s.substring(begin, end);
//                    return longPalindrome;
//                }
//
//                if (begin == 0 && end == 0 && s.charAt(i) == s.charAt(j)) {
//                    begin = i;
//                    end = j;
////                    j--;
//                    i++;
//                    break;
//                }
//                if (s.charAt(i) != s.charAt(j)) {
//                    begin = 0;
//                    end = 0;
////                    j--;
//                }

            }
            i++;
        }
        throw new IllegalArgumentException("No solution");
    }
}

//思路：从最长开始扫描，找到最长的回文串，一旦再次扫描，被扫描的串长度小于回文串长度，便不用扫描这个子串
//longestPalindrome(String s)超出时间限制

//思路2：同时从前向后、从后向前扫描，字符相同则可能是潜在的回文子串，找到直接是最长的

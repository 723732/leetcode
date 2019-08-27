package before;

public class Num10 {
    public boolean isMatch(String s, String p){
        for (int i = 1; i < s.length(); i++){
            if(s.charAt(i) == p.charAt(i)){
                if(s.charAt(i-1) == p.charAt(i-1))
                    continue;
                else if(p.charAt(i-1) == '.')
                    continue;
                else
                    return false;
            }
            else{
                if(s.charAt(i-1) == p.charAt(i-1) && p.charAt(i) == '.')
                    continue;

            }

        }
        return true;
    }
}
//从s和p的第一个字符开始匹配
//每次得观察前一个字符
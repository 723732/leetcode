import before.Num3;
import org.junit.Test;

public class Num3Test {

    String s = "pwwkew";
    String s1 = "abbcbb";
    String s2 = " acbb";
    String s3 = " a";
    String s4 = "dvdf";

    @Test
    public void lengthOfLongestSubstring() {
        Num3 t = new Num3();
        int len = t.lengthOfLongestSubstring(s4);
        System.out.println(len);

    }
}
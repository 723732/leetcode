import org.junit.Test;

import static org.junit.Assert.*;

public class Num5Test {
    Num5 no5 = new Num5();

    String s1 = "babad";
    String s2 = "";
    String s3 = "cbbd";
    String s4 = "a";
    String s5 = "eabcb";
    String s6 = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";

    @Test
    public void longestPalindrome() {
        assertEquals("bab", no5.longestPalindrome(s1));
//        assertEquals("aba", no5.longestPalindrome(s1));
        assertEquals("bb", no5.longestPalindrome(s3));
        assertEquals("", no5.longestPalindrome(s2));
        assertEquals("a", no5.longestPalindrome(s4));
        assertEquals("bcb", no5.longestPalindrome(s5));
        System.out.println(no5.longestPalindrome(s6));
    }

    @Test
    public void reverseString() {
        assertEquals("dabab", no5.reverseString(s1));
        assertEquals("", no5.reverseString(s2));
        assertEquals("a", no5.reverseString(s4));
    }
}
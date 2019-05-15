import org.junit.Test;

import static org.junit.Assert.*;

public class Num14Test {
    String[] strs1 = {"flower","flow","flight"};
    String[] strs2 = {"dog","racecar","car"};

    Num14 no14 = new Num14();

    @Test
    public void longestCommonPrefix() {
        assertEquals("fl", no14.longestCommonPrefix(strs1));
        assertEquals("", no14.longestCommonPrefix(strs2));
    }
}
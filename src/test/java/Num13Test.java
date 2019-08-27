import before.Num13;
import org.junit.Test;

import static org.junit.Assert.*;

public class Num13Test {

    String s1 = "IV";
    String s2 = "III";
    String s3 = "IX";
    String s4 = "LVIII";
    String s5 = "MCMXCIV";

    Num13 no13 = new Num13();
    @Test
    public void romanToInt() {
        assertEquals(4, no13.romanToInt(s1));
        assertEquals(3, no13.romanToInt(s2));
        assertEquals(9, no13.romanToInt(s3));
        assertEquals(58, no13.romanToInt(s4));
        assertEquals(1994, no13.romanToInt(s5));

    }
}
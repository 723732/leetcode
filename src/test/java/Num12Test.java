import before.Num12;
import org.junit.Test;

import static org.junit.Assert.*;

public class Num12Test {

    int a1 = 1994;
    int a2 = 4;
    int a3 = 3;
    int a4 = 9;
    int a5 = 58;
    int a6 = 10;


    Num12 no12 = new Num12();
    @Test
    public void intToRoman() {
        assertEquals("MCMXCIV", no12.intToRoman(a1));
        assertEquals("IV", no12.intToRoman(a2));
        assertEquals("III", no12.intToRoman(a3));
        assertEquals("IX", no12.intToRoman(a4));
        assertEquals("LVIII", no12.intToRoman(a5));
        assertEquals("X", no12.intToRoman(a6));
    }
}
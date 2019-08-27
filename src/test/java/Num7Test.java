import array.Num7;
import org.junit.Test;

import static org.junit.Assert.*;

public class Num7Test {
    int x = -123;
    int x1 = 123;
    int x2 = 120;
    int x3 = 0;
    int x4 = 2147483647;

    Num7 no7 = new Num7();

    @Test
    public void reverse() {
//        no7.reverse(x);
//        System.out.print(no7.reverse(x4));
//        System.out.print(no7.reverse(x3));
        assertEquals(-321, no7.reverse(x));
        assertEquals(321, no7.reverse(x1));
        assertEquals(21, no7.reverse(x2));
        assertEquals(0, no7.reverse(x4));
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

public class Num11Test {

    int[] a1 = {1,8,6,2,5,4,8,3,7};
    int[] a2 = {1};
    int[] a3 = {};
    int[] a4 = {0,5};
    int[] a5 = {1,5};

    Num11 no11 = new Num11();
    @Test
    public void maxArea() {
        assertEquals(49, no11.maxArea(a1));
        assertEquals(0, no11.maxArea(a2));
        assertEquals(0, no11.maxArea(a3));
        assertEquals(0, no11.maxArea(a4));
        assertEquals(1, no11.maxArea(a5));
    }
}
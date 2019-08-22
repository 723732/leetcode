package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimetoBuyandSellStock121Test {
    int[] a = {7,1,5,3,6,4};
    int[] c = {7,6,4,3,1};
    BestTimetoBuyandSellStock121 b = new BestTimetoBuyandSellStock121();
    @Test
    public void maxProfit() {
        assertEquals(5, b.maxProfit(a));
        assertEquals(0, b.maxProfit(c));
    }

    @Test
    public void maxProfit1() {
        assertEquals(5, b.maxProfit(a));
        assertEquals(0, b.maxProfit(c));
    }

}
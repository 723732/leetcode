package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaintHouse256Test {
    int[][] a = {{17,2,17}, {16,16,5}, {14,3,19}};
    @Test
    public void minCost() {
        PaintHouse256 b = new PaintHouse256();
        assertEquals(10, b.minCost(a));
    }
}
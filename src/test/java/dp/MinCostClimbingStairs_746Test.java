package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinCostClimbingStairs_746Test {

    int[] cost1 = {10, 15, 20};
    int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
    MinCostClimbingStairs_746 a = new MinCostClimbingStairs_746();
    @Test
    public void minCostClimbingStairs() {
        assertEquals(15, a.minCostClimbingStairs(cost1));
        assertEquals(6, a.minCostClimbingStairs(cost2));
    }
}
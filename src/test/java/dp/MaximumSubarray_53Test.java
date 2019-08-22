package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarray_53Test {
    int[] a = {-2,1,-3,4,-1,2,1,-5,4};
    MaximumSubarray_53 b = new MaximumSubarray_53();

    @Test
    public void maxSubArray() {
        assertEquals(6, b.maxSubArray(a));
    }
}
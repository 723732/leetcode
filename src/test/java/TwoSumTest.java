import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {
    TwoSum twosum = new TwoSum();

    @Test
    public void twoSum1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] a = twosum.twoSum1(nums, target);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}
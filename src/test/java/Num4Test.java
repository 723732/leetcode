import org.junit.Test;

import static org.junit.Assert.*;

public class Num4Test {
    Num4 no4 = new Num4();

    int[] nums1 = {1, 3};
    int[] nums2 = {2};
    int[] nums3 = {1};
    int[] nums4 = {1};

    @Test
    public void findMedianSortedArrays() {

        assertEquals(1.0, no4.findMedianSortedArrays(nums3, nums4), 0.0);
        assertEquals(2.0, no4.findMedianSortedArrays(nums1, nums2), 0.0);
        assertEquals(1.0, no4.findMedianSortedArrays(nums1, nums4), 0.0);
    }
}
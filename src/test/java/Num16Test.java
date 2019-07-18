import org.junit.Test;

import static org.junit.Assert.*;
import main.java.Num16;

public class Num16Test {

    int[] nums = {-1, 2, 1, -4};
    int[] nums1 = {0,2,1,-3};//1, 0
    int[] nums2 = {1,1,-1,-1,3};//3, 3
    int[] nums3 = {1,2,4,8,16,32,64,128};//82,82
    int[] nums4 = {1,2,5,10,11};//12,13
    int[] nums5 = {1,6,9,14,16,70};//81,80
    int[] nums6 = {-55,-24,-18,-11,-7,-3,4,5,6,9,11,23,33};

    Num16 no16 = new Num16();
    @Test
    public void threeSumClosest() {
//        assertEquals(2, no16.threeSumClosest(nums, 1));
//        assertEquals(0, no16.threeSumClosest(nums1, 1));
//        assertEquals(3, no16.threeSumClosest(nums2, 3));
//        assertEquals(82, no16.threeSumClosest(nums3, 82));
//        assertEquals(13, no16.threeSumClosest(nums4, 12));
//        assertEquals(80, no16.threeSumClosest(nums5, 81));
        assertEquals(0, no16.threeSumClosest(nums6, 0));
    }
}
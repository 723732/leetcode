import org.junit.Test;

import static org.junit.Assert.*;
import main.java.Num15;

public class Num15Test {
    int[] nums1 = {-1, 0, 1, 2, -1, -4};
    int[] nums2 = {0, 0, 0};
    int[] nums3 = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
    //[[-5,1,4],[-4,0,4],[-4,1,3],[-2,-2,4],[-2,1,1],[0,0,0]]

    Num15 no15 = new Num15();
    @Test
    public void threeSum() {
        System.out.print(no15.threeSum(nums1));
        System.out.print(no15.threeSum(nums2));
        System.out.print(no15.threeSum(nums3));
    }
}
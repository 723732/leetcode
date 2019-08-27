package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedArray_88Test {


    MergeSortedArray_88 a = new MergeSortedArray_88();
    @Test
    public void merge1() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        a.merge1(nums1, m, nums2, n);
    }

    @Test
    public void merge2() {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;
        a.merge1(nums1, m, nums2, n);
    }
    //[4,5,6,0,0,0]
    //3
    //[1,2,3]
    //3
}
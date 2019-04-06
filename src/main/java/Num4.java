public class Num4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] all = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;

        if(nums1 != null || nums2 != null){

            for(int k = 0; k < all.length;){
                if(j >= nums2.length){
                    all[k] = nums1[i];
                    i++;
                    k++;
                }
                else if(i >= nums1.length){
                    all[k] = nums2[j];
                    j++;
                    k++;
                }
                else if(nums1[i] <= nums2[j]){
                    all[k] = nums1[i];
                    i++;
                    k++;
                }
                else if(nums1[i] > nums2[j]){
                    all[k] = nums2[j];
                    j++;
                    k++;
                }
            }

        }

        if(all.length%2 == 0)
            return (double)(all[all.length/2 - 1] + all[all.length/2])/2;
        if(all.length%2 == 1)
            return (double)all[all.length/2];

        throw new IllegalArgumentException("No solution");
    }
}

//将两个数组合并为一个数组时排好序
//

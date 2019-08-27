package array;
//88. 合并两个有序数组
//
//        给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
//
//        说明:
//
//        初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
//        你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
//        示例:
//
//        输入:
//        nums1 = [1,2,3,0,0,0], m = 3
//        nums2 = [2,5,6],       n = 3
//
//        输出: [1,2,2,3,5,6]
public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int start = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = start; j < m + n; j++){
                if(nums2[i] < nums1[j]){
                    for(int k = m+n-1; k > j; k--){
                        nums1[k] = nums1[k-1];
                    }
                    nums1[j] = nums2[i];
                    start = j + 1;
                    count++;
                    break;
                }
                else if(j >= m + count && nums1[j] == 0){
                    nums1[j] = nums2[i];
                    start = j + 1;
                    break;
                }

            }
        }
    }

    //从末尾开始比较，大的放置在nums1的末尾
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        while(m > 0 && n >0){
            if (nums1[m-1] > nums2[n-1]){
                nums1[m+n-1] = nums1[m-1];
                m--;
            }
            else if (nums1[m-1] == nums2[n-1]){
                nums1[m+n-1] = nums1[m-1];
                nums1[m+n-2] = nums1[m-1];
                m--;
                n--;
            }
            else{
                nums1[m+n-1] = nums2[n-1];
                n--;
            }
        }
    }
}

import java.util.Arrays;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//Example:
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1]
class TwoSum{
    public int[] twoSum1(int[] nums, int target) {
//        先给数组排序，
//        如果nums[i]小于target-nums[i+1]，继续向后遍历，直到相等，返回；大于，i加1
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] > target - nums[j])
                    break;
                if(nums[i] == target - nums[j])
                    return new int[] {i, j};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
//        int len=nums.length;
//        int[] a=new int[2];
//
//        outer:
//        for(int i=0;i<len-1;i++){
//            for(int j=i+1;j<len;j++){
//                if(nums[j]==target-nums[i]){
//                    a[0]=i;
//                    a[1]=j;
//                    break outer;
//                }
//            }
//        }
//
//        return a;
    }
}
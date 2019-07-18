package main.java;

import java.util.Arrays;

public class Num16 {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length < 3)
            return 0;
        if (nums.length == 3)
            return nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);

        int tmp;
        int sum = nums[0] + nums[1] + nums[2];
        int sum1;
        int begin;
        int end;
        int result = nums[0] + nums[1] + nums[2];

        for (int i = 3; i < nums.length - 2; i++){
            tmp = nums[i] + nums[i+1] + nums[i+2];
            if (tmp > target){
                result = (Math.abs(target - result) < Math.abs(target - tmp))? result:tmp;
                break;
            }

            else if (tmp == target)
                return target;

            begin = i + 1;
            end = nums.length - 1;
            int less = 0;
            int more = 0;
            while (begin < end){
                sum1 =  nums[i] + nums[begin] + nums[end];
                if (sum1 == target)
                    return target;
                else if (sum1 < target){
                    less = Math.abs(target - sum1);
                    if (more < less && less != 0 && more !=0)
                        break;
                    while (begin < end && nums[begin+1] == nums[begin])
                        begin++;
                    begin++;
                }
                else {
                    more = Math.abs(sum1 - target);
                    if (less < more && more != 0 && less != 0)
                        break;
                    while (begin < end && nums[end-1] == nums[end])
                        end--;
                    end--;
                }
                sum = sum1;
            }

            result = (Math.abs(target - result) < Math.abs(target - sum))? result:sum;

// 1.           for (int j = i+1; j < nums.length-1; j++){
//                for (int k = j+1; k < nums.length; k++){
//                    if (nums[j] + nums[k] > target - nums[i]){
//                        sum1 = (Math.abs(target - sum1) < Math.abs(target - (nums[i]+nums[j]+nums[k])))? sum1:nums[i]+nums[j]+nums[k];
//                        break;
//                    }
//                    else{
//                        sum1 = nums[i]+nums[j]+nums[k];
//                        continue;
//                    }
//
//                }
//                sum = (Math.abs(target - sum) < Math.abs(target - sum1))? sum:sum1;
//            }

        }
        return result;
    }
}
//1.用时太长
//执行用时 : 82 ms, 在3Sum Closest的Java提交中击败了12.48% 的用户
//        内存消耗 : 35.8 MB, 在3Sum Closest的Java提交中击败了85.56% 的用户
//先排序，如果下一个三数之和超出target和上一个三数之和的范围，break
//如果第一个数小于target，加上后面的数可能越加越接近
//如果第一个数大于target，加上后面的数只能越加越不接近,break
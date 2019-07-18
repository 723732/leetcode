package main.java;

import java.util.*;

public class Num15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        int target;
        int begin;
        int end;
        for (int i = 0; i < nums.length - 2; i++){
            if (nums[i] > 0)
                break;
            else if (i > 0 && nums[i] == nums[i-1])
                continue;
            else
                target = 0 - nums[i];

            begin = i + 1;
            end = nums.length - 1;
            while(begin < end){
                if(nums[begin] + nums[end] < target)
                    begin++;
                else if (nums[begin] + nums[end] > target)
                    end--;
                else {
                    list.add(Arrays.asList(nums[i], nums[begin], nums[end]));
                    while (begin < end && nums[begin+1] == nums[begin])
                        begin++;
                    while (begin < end && nums[end-1] == nums[end])
                        end--;
                    begin++;
                    end--;
                }
            }
        }

        return list;
    }

    public List<List<Integer>> threeSum1(int[] nums) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        HashSet<List<Integer>> list1 = new HashSet<List<Integer>>();

        for (int i = 0; i < nums.length-2; i++)
            for (int j = i+1; j < nums.length-1; j++)
                for (int k = j+1; k < nums.length; k++){
                    flag:if(nums[i] + nums[j] + nums[k] == 0){
                        for (List<Integer> h : list1){
                            if(!h.contains(nums[i]) || !h.contains(nums[j]) || !h.contains(nums[k]))
                                continue;
                            else if((nums[i] == 0 && nums[j] == 0) || (nums[i] == 0 && nums[k] == 0) || (nums[k] == 0 && nums[j] == 0))
                                continue;
                            else
                                break flag;
                        }
                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);

                        list1.add(tmp);
                    }
        }
        list.addAll(list1);
        return list;
    }
}
//threeSum1超出时间限制

//注意跳过重复的数字
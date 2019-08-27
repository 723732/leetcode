public class WrittenTest {
//    在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 个数字。
//
//    注意:
//    n 是正数且在32为整形范围内 ( n < 2^31)。
//
//    示例 1:
//
//    输入:
//            3
//
//    输出:
//            3
//    示例 2:
//
//    输入:
//            11
//
//    输出:
//            0
//
//    说明:
//    第11个数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是0，它是10的一部分。
    public int findNthDigit(int n) {
        if (n < 10)
            return n;
        int tar = 1;
        int result = n - (int)Math.pow(10, tar-1)*9*tar ;
        while (result > 0){
            tar++;
            result = result - (int)Math.pow(10, tar-1)*9*tar;
        }

        result = result + (int)Math.pow(10, tar-1)*9*tar;
        //row
        int row = result/((int)Math.pow(10, tar-1)*tar);//第row排
        int col = result%((int)Math.pow(10, tar-1)*tar);
        if (col == 0)
            return 9;

        int a = col/tar;//第a个数
        int b = col%tar;//第b位
        if (b > 0){
            //最终的数字是
            int c = (row+1) * (int)Math.pow(10, tar-1) + (a-1);
            c = c + 1;
            String d = Integer.toString(c);
            return Integer.parseInt(String.valueOf(d.charAt(b-1)));
        }
        else{
            String d = Integer.toString(a -1);
            return Integer.parseInt(String.valueOf(d.charAt(d.length()-1)));
        }




    }

//    峰值元素是指其值大于左右相邻值的元素。
//
//    给定一个输入数组 nums，其中 nums[i] ≠ nums[i+1]，找到峰值元素并返回其索引。
//
//    数组可能包含多个峰值，在这种情况下，返回任何一个峰值所在位置即可。
//
//    你可以假设 nums[-1] = nums[n] = -∞。
//
//    示例 1:
//
//    输入: nums = [1,2,3,1]
//    输出: 2
//    解释: 3 是峰值元素，你的函数应该返回其索引 2。
//    示例 2:
//
//    输入: nums = [1,2,1,3,5,6,4]
//    输出: 1 或 5
//    解释: 你的函数可以返回索引 1，其峰值元素为 2；
//    或者返回索引 5， 其峰值元素为 6。
//    说明:
//
//    你的解法应该是 O(logN) 时间复杂度的。
    public int findPeakElement(int[] nums) {
//        if(nums.length <2)
//            return 0;
//        if(nums.length <3)
//            return nums[0] > nums[1] ? 0 : 1;
//        int result = 0;
//        int begin = 0;
//        int end = nums.length - 1;
//        int tar = 0;
//        while (begin < end - 1){
//            int mid = (begin + end)/2;
//            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]){
//                result = mid;
//                break;
//            }
//            else if (tar == 0){
//                begin++;
//            }
//
//            else if (tar == 1){
//                end--;
//            }
//
//            if(begin == end-1 && tar == 0){
//                tar = 1;
//                begin = 0;
//                end = nums.length - 1;
//            }
//        }
//
//        if(result == 0)
//            return nums[0] > nums[nums.length-1] ? 0 : nums.length-1;
//        return result;
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

//    第 i 个人的体重为 people[i]，每艘船可以承载的最大重量为 limit。
//
//    每艘船最多可同时载两人，但条件是这些人的重量之和最多为 limit。
//
//    返回载到每一个人所需的最小船数。(保证每个人都能被船载)。
//
//
//
//    示例 1：
//
//    输入：people = [1,2], limit = 3
//    输出：1
//    解释：1 艘船载 (1, 2)
//    示例 2：
//
//    输入：people = [3,2,2,1], limit = 3
//    输出：3
//    解释：3 艘船分别载 (1, 2), (2) 和 (3)
//    示例 3：
//
//    输入：people = [3,5,3,4], limit = 5
//    输出：4
//    解释：4 艘船分别载 (3), (3), (4), (5)
}

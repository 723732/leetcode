import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        int result = 0;
        int[] nums = {20,50,22,74,9,63};
        Arrays.sort(nums);
        for(int i = 0; i < 5; i++){
            int count = 2;
            int tmp = 1;
            while(nums[i] != 0 && count <= nums[i]){
                for(int j = i+1; j < 6; j++){
                    if(nums[i]%count == 0 && nums[j]%count == 0 && nums[j] != 0){
                        tmp++;
                        nums[j] = 0;
                    }
                }
                count++;
            }
            nums[i] = 0;
            result = Math.max(result, tmp);
        }
        System.out.println(result);

    }

}

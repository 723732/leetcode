package before;

public class Num11 {
    public int maxArea(int[] height){
        int max = 0;
        int tmp = 0;

        if(height.length == 0 || height.length == 1)
            return 0;

        for (int i = 0; i < height.length-1; i++)
            for (int j = i+1; j < height.length; j++){
                tmp = (j-i) * Math.min(height[i], height[j]);

                if(tmp > max)
                    max = tmp;
            }

        return max;
    }
}
//两个循环找到面积最大的
//执行用时太长

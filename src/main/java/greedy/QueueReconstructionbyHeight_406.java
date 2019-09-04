package greedy;
//406. 根据身高重建队列
//        假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对(h, k)表示，其中h是这个人的身高，k是排在这个人前面且身高大于或等于h的人数。 编写一个算法来重建这个队列。
//
//        注意：
//        总人数少于1100人。
//
//        示例
//
//        输入:
//        [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
//
//        输出:
//        [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QueueReconstructionbyHeight_406 {
    //先按照身高由高到低排序再根据后一个数字插入
    public int[][] reconstructQueue(int[][] people) {
        int[][] res = new int[people.length][];
        if (people.length == 0)
            return res;
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[1] - o2[1];
                return o2[0] - o1[0];
            }
        });

        List<int[]> result = new ArrayList<>();
        result.add(people[0]);
        for (int i = 1; i < people.length; i++){
            result.add(people[i][1], people[i]);
        }

        for (int i = 0; i < people.length; i++){
            res[i] = result.get(i);
        }
        return res;
    }
}

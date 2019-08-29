package chart;

import java.util.ArrayList;
import java.util.List;

//207. 课程表
//        现在你总共有 n 门课需要选，记为 0 到 n-1。
//
//        在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们: [0,1]
//
//        给定课程总量以及它们的先决条件，判断是否可能完成所有课程的学习？
//
//        示例 1:
//
//        输入: 2, [[1,0]]
//        输出: true
//        解释: 总共有 2 门课程。学习课程 1 之前，你需要完成课程 0。所以这是可能的。
//        示例 2:
//
//        输入: 2, [[1,0],[0,1]]
//        输出: false
//        解释: 总共有 2 门课程。学习课程 1 之前，你需要先完成​课程 0；并且学习课程 0 之前，你还应先完成课程 1。这是不可能的。
//        说明:
//
//        输入的先决条件是由边缘列表表示的图形，而不是邻接矩阵。详情请参见图的表示法。
//        你可以假定输入的先决条件中没有重复的边。
//        提示:
//
//        这个问题相当于查找一个循环是否存在于有向图中。如果存在循环，则不存在拓扑排序，因此不可能选取所有课程进行学习。
//        通过 DFS 进行拓扑排序 - 一个关于Coursera的精彩视频教程（21分钟），介绍拓扑排序的基本概念。
//        拓扑排序也可以通过 BFS 完成。
public class CourseSchedule_207 {
    //检测有向图中是否有环
    //深度优先遍历，一条有向边v->w,w已经存在于栈中，即有环
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //localflags[]被当前路径访问的节点
        //globalflags[]已经在其他路径中访问了的节点

        List<Integer>[] adj = new List[numCourses];//每个点到达的节点
        for (int i = 0; i < numCourses; i++){
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < prerequisites.length; i++){
            adj[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        boolean[] localflags = new boolean[numCourses];
        boolean[] globalflags = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++){
            if (hasCycle(i, adj, localflags, globalflags))
                return false;
        }

        return true;
    }

    public boolean hasCycle(int i, List<Integer>[] adj, boolean[] localflags, boolean[] globalflags){
        if (localflags[i])
            return true;

        if (globalflags[i])//当前节点已经判断过是否形成换，跳过进入下一个节点的判断
            return false;

        globalflags[i] = true;
        localflags[i] = true;
        for (int a: adj[i]){
            if (hasCycle(a, adj, localflags, globalflags))
                return true;
        }

        localflags[i] = false;
        return false;
    }

}

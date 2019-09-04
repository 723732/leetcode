package search;
//127. 单词接龙
//        给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord 的最短转换序列的长度。转换需遵循如下规则：
//
//        每次转换只能改变一个字母。
//        转换过程中的中间单词必须是字典中的单词。
//        说明:
//
//        如果不存在这样的转换序列，返回 0。
//        所有单词具有相同的长度。
//        所有单词只由小写字母组成。
//        字典中不存在重复的单词。
//        你可以假设 beginWord 和 endWord 是非空的，且二者不相同。
//        示例 1:
//
//        输入:
//        beginWord = "hit",
//        endWord = "cog",
//        wordList = ["hot","dot","dog","lot","log","cog"]
//
//        输出: 5
//
//        解释: 一个最短转换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog",
//        返回它的长度 5。
//        示例 2:
//
//        输入:
//        beginWord = "hit"
//        endWord = "cog"
//        wordList = ["hot","dot","dog","lot","log"]
//
//        输出: 0
//
//        解释: endWord "cog" 不在字典中，所以无法进行转换。


import java.util.ArrayList;
import java.util.List;

public class WordLadder_127 {
    //寻找最短路径，bfs广度优先搜索
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        wordList.add(0, beginWord);
        List<Integer>[] graph = buildGraph(wordList);
        int path = 0;

        //图生成，开始bfs
        boolean[] marked = new boolean[wordList.size()];//标记节点是否已经被访问到

        return path;
    }

    //建图,存单词在wordList中的序号
    public List<Integer>[] buildGraph(List<String> wordList){
        int count = wordList.size();
        List<Integer>[] graph = new List[count];
        for (int i = 0; i < count; i++){
            graph[i] = new ArrayList<>();
        }

        //找与第i个单词只相差一个字母的单词，将其序号加入graph[i]
        for (int i = 0; i < count; i++){
            for (int j = 0; j < count; j++){
                if (isCorrect(wordList.get(i), wordList.get(j)))
                    graph[i].add(j);
            }
        }

        return graph;
    }

    public boolean isCorrect(String word1, String word2){
        //统计不同字母的个数是否为1
        int count = 0;
        for (int i = 0; i < word1.length(); i++){
            if (word1.charAt(i) != word2.charAt(i))
                count++;
        }

        return count == 1;
    }
}

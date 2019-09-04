

import java.util.*;

public class test2 {
//    1.输入字符包括英文字符，"(" , ")" 和 "<"。
//            2.英文字符表示笔记内容。
//            3. (  ) 之间表示注释内容，任何字符都无效。 括号保证成对出现。
//            4. "<" 表示退格, 删去前面一个笔记内容字符。 括号不受 "<" 影响 。
    public static void main(String[] args) {
        //a<<b((c)<),b

//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//
//        String res = getResult(a);
//        System.out.print(res);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] table = new int[n][2];
//        for (int i = 0; i < n; i++){
//            table[i][0] = sc.nextInt();
//            table[i][1] = sc.nextInt();
//        }
//
//        int res = getResult(table);
//        System.out.print(res);

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String[] table = new String[n];
//        for (int i = 0; i < n; i++){
//            table[i] = sc.nextLine();
//        }
//
//        int res = getResult(table);
//        System.out.print(res);
        String a = getResult("a<<b((c)<)");
    }

//    static int getResult(String[] table){
//
//    }

    static int getResult(int[][] table){
        Arrays.sort(table, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });

        int count = 1;
        for (int i = 1; i < table.length; i++){
            if (table[i][0] >= table[i-1][0] && table[i][1] >= table[i-1][1])
                count++;
        }
        return count;
    }
    static String getResult(String a){
        Stack<Character> tmp = new Stack<>();
        tmp.push(a.charAt(0));
        for (int i = 1; i < a.length(); i++){
            if (a.charAt(i) == ')'){
                char b = tmp.pop();
                while (b != '('){
                    b = tmp.pop();
                }
            }

            else if (a.charAt(i) == '<'){
                if(!tmp.isEmpty()){
                    char b = tmp.pop();
                    if (b == '(' || b == ')')
                        tmp.push(b);
                }

            }
            else
                tmp.push(a.charAt(i));
        }

        String res = "";
        while (!tmp.isEmpty()){
            char d = tmp.pop();
            if (d != '<')
                res = tmp.pop() + res;
        }

        return res;
    }

    static int getPath(int[][] table){
        int row = table.length;
        int col = table[0].length;
        int[][] dp = new int[row][col];//在i，j位置时最短路径长度
        for (int i = 1; i < row; i++){
            if (table[i][0] != 1)
                dp[i][0] = dp[i-1][0] + 1;
            else
                break;

        }

        for (int i = 1; i < col; i++){
            if (table[0][i] != 1)
                dp[0][i] = dp[0][i] + 1;
            else
                break;
        }

        if (table[0][0] == 1)
            return 0;

        for (int i = 1; i < row; i++){
            for (int j = 1; j < col; j++){
                if (table[i][j] != 1){
                    dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]) + 1;
                }
            }
        }

        return dp[row-1][col-1];
    }

}

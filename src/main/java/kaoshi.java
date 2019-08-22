import java.util.Scanner;
import java.util.Stack;

import static java.lang.Integer.*;

//HG[3|B[2|CA]]F
//HGBCACABCACABCACAF
public class kaoshi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }

    public String extend(String shortstring){
        Stack<Character> stringStack = new Stack<>();
        String result = "";
        if (shortstring.isEmpty())
            return result;

        for (int i = 0; i < shortstring.length(); i++){
            if (shortstring.charAt(i) == ']'){
                char tmp = stringStack.pop();
                String partstring = "";
                while (tmp != '['){
                    int a = 0;
//                    if (tmp == '|'){
//                        a = stringStack.pop() - '0';
//                        String tmp1 = partstring;
//                        for (int j = 0; j < a - 1; j++){
//                            partstring = tmp1 + partstring;
//                        }
//                    }
                    if (tmp == '|'){
                        tmp = stringStack.pop();
                        String num = "";
                        while(tmp != '['){
                            num = tmp + num;
                            tmp = stringStack.pop();
                        }
                        String tmp1 = partstring;
                        a = Integer.parseInt(num);
                        for (int j = 0; j < a - 1; j++){
                            partstring = tmp1 + partstring;
                        }
                    }
                    else{
                        partstring = tmp + partstring;
                        tmp = stringStack.pop();
                    }

//                    tmp = stringStack.pop();
                }

                for (int k = 0; k < partstring.length(); k++){
                    stringStack.push(partstring.charAt(k));
                }
            }
            else
                stringStack.push(shortstring.charAt(i));
        }

        while (!stringStack.isEmpty()){
            result = stringStack.pop() + result;
        }
        int i = Integer.parseInt("1");

        return result;



    }
}

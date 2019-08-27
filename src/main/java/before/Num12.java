package before;

public class Num12 {
    public String intToRoman(int num){
        String[] symbol = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        StringBuffer roman = new StringBuffer();

        int k = 0;
        if (num > 999 && num < 4000)
            k = 4;
        else if (num > 99 && num < 1000)
            k = 3;
        else if (num > 9 && num < 100)
            k = 2;
        else
            k = 1;

        int b = 0;
        int b1 = 0;
        while(k > 0){
            num = num % (int) Math.pow(10, k);
            if (k-1 > 0)
                b = num / (int) Math.pow(10, k-1);
            else
                b = num;
            b1 = b % 5;

            if (b >= 5 && b < 9)
                roman.append(symbol[4*(k-1) + 2]);
            else if (b >= 1 && b < 4){
                roman.append(symbol[4*(k-1)]);
                b1--;
            }
            else if (b == 9)
                roman.append(symbol[4*(k-1) + 3]);
            else if (b == 4)
                roman.append(symbol[4*(k-1) + 1]);

            while (b1 > 0 && b1 < 4){
                roman.append(symbol[4*(k-1)]);
                b1--;
            }
            k--;
        }

        return roman.toString();
    }
}
//执行用时击败74.39%

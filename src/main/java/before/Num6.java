package before;

public class Num6 {
    public String convert(String s, int numRows){
        String zig = "";
        int tmp = 0;
        int div = numRows*2 - 2;

        if(s == null || s.isEmpty())
            return s;

        if(numRows < 2)
            return s;

        for (int i = 0; i < numRows; i++)
            for (int j = 0; j <= s.length()/div + 1; j++){
                if(i != 0 && i != numRows -1){
                    tmp = j*div - i;
                    if(tmp > 0 && tmp < s.length())
                        zig = zig + s.charAt(tmp);
                }

                tmp = j*div + i;
                if(tmp >= 0 && tmp < s.length())
                    zig = zig + s.charAt(tmp);
            }

        return zig;
    }
}
//内存消耗和执行用时都太大

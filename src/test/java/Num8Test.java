import org.junit.Test;

import static org.junit.Assert.*;

public class Num8Test {

    String s1 = "  -";
    String s2 = " +-1";
    String s3 = " +1 -";
    String s4 = " aa+1 -";
    String s5 = "20000000000000000000";
    String s6 = "  ++ 123";

    Num8 no8 = new Num8();
    @Test
    public void myAtoi() {

        System.out.print(no8.myAtoi(s6));
    }
}
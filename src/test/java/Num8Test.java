import org.junit.Test;

import static org.junit.Assert.*;

public class Num8Test {

    String s1 = "  -";

    Num8 no8 = new Num8();
    @Test
    public void myAtoi() {
        System.out.print(no8.myAtoi(s1));
    }
}
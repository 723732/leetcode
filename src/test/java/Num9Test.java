import org.junit.Test;

import static org.junit.Assert.*;

public class Num9Test {

    int a = 121;
    int a2 = -121;
    int a3 = 10;
    int a4 = 1;

    Num9 no9 = new Num9();
    @Test
    public void isPalindrome() {
        assertEquals(true, no9.isPalindrome(a));
        assertEquals(false, no9.isPalindrome(a2));
        assertEquals(false, no9.isPalindrome(a3));
        assertEquals(true, no9.isPalindrome(a4));
    }
}
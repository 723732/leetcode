import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Num17Test {
    String a = "23";

    Num17 no17 = new Num17();

    @Test
    public void letterCombinations() {
//        List<String> a1 = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
//        assertEquals(a1, no17.letterCombinations("23"));
        System.out.print(no17.letterCombinations("47645"));
    }
}
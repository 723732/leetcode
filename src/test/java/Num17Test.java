import org.junit.Test;

import before.Num17;

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
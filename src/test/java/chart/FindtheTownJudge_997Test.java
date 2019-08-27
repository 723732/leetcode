package chart;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindtheTownJudge_997Test {

    FindtheTownJudge_997 a = new FindtheTownJudge_997();
    int n1 = 2;
    int[][] trust = {{1, 2}};
    @Test
    public void findJudge() {
        assertEquals(2, a.findJudge(n1, trust));
    }
}
package chart;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberofConnectedComponentsinanUndirectedGraph_323Test {
//6
//        [[0,1],[0,2],[2,5],[3,4],[3,5]]
    int n = 6;
    int[][] a = {{0,1},{0,2},{2,5},{3,4},{3,5}};
    NumberofConnectedComponentsinanUndirectedGraph_323 b = new NumberofConnectedComponentsinanUndirectedGraph_323();
    @Test
    public void countComponents() {
        assertEquals(1, b.countComponents(n,a));
    }
}
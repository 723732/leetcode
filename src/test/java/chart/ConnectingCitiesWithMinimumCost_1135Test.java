package chart;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConnectingCitiesWithMinimumCost_1135Test {

    int n1 = 3;
    int[][] a = {{1,2,5},{1,3,6},{2,3,1}};
    ConnectingCitiesWithMinimumCost_1135 b = new ConnectingCitiesWithMinimumCost_1135();
    @Test
    public void minimumCost() {
        System.out.print(b.minimumCost(n1, a));
    }
}
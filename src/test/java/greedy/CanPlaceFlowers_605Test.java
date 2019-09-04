package greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CanPlaceFlowers_605Test {

    int[] flo = {1,0,0,0,1};
    int n = 2;
    CanPlaceFlowers_605 a = new CanPlaceFlowers_605();
    @Test
    public void canPlaceFlowers() {
        System.out.print(a.canPlaceFlowers(flo, n));
    }
}
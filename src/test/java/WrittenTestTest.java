import org.junit.Test;

import static org.junit.Assert.*;

public class WrittenTestTest {

    WrittenTest a = new WrittenTest();
    @Test
    public void findNthDigit() {
        System.out.print(a.findNthDigit(1000000000));
    }

    @Test
    public void findPeakElement() {
        int[] b = {1,2,3,1};
        int[] c = {1,6,5,4,3,2,3};
        System.out.print(a.findPeakElement(c));
    }
}
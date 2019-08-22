import org.junit.Test;

import static org.junit.Assert.*;

public class kaoshiTest {
    String a = "HG[3|B[2|CA]]F";
    kaoshi b = new kaoshi();
    @Test
    public void extend() {
        System.out.print(b.extend(a));
    }
}
import before.Num6;
import org.junit.Test;

public class Num6Test {

    String s1 = "PAYPALISHIRING";
    int r1 = 3;
    int r2 = 4;
    String s2 = "abcde";

    Num6 no6 = new Num6();

    @Test
    public void convert() {
        System.out.print(no6.convert(s1, 4));
    }
}
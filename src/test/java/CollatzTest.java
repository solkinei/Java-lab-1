import org.junit.Test;

import static org.junit.Assert.*;

public class CollatzTest {

    @Test
    public void seqCollatz() {
        Collatz num = new Collatz(1000000);
        long expected = 837799;
        num.seqCollatz(num);
        long actual = num.getNumber();
        assertEquals("seqCollatz method is not working", expected, actual);
    }
}
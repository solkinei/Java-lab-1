import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void seqCollatz() {
        long maxNumber = 1000000;
        long num = 0;
        long actualNumWithMaxLen = Task1.seqCollatz(num, maxNumber);
        assertEquals("seqCollatz method is not working", 837799, actualNumWithMaxLen);
    }

    @Test
    public void seqCollatz1() {
        long maxNumber = 1;
        long num = 0;
        long actualNumWithMaxLen = Task1.seqCollatz(num, maxNumber);
        assertEquals("seqCollatz method is not working", 1, actualNumWithMaxLen);
    }
}
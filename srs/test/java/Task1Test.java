import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void seqCollatz() {
        assertEquals(1,Task1.Collatz(1));
        assertEquals(21,Task1.Collatz(19));
        assertEquals(525,Task1.Collatz(837799));
    }
}
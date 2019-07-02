import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void seqCollatz() {
            assertEquals(525, Collatz.seqCollatz(837799));
        }
}
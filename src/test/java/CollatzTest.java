import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CollatzTest {

    @Test
    public void collatz() {
        assertEquals(146, Collatz.collatz(7864));
    }

} 
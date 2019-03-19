import org.junit.Test;

import static org.junit.Assert.*;

public class CollatzTest {

    @Test
    public void calculation() {
        Collatz one = new Collatz();
        assertEquals(525, one.calculation(837799));
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void expand() {
        assertEquals("1,2,4,5,6,7,18,19,20,21", Task3.expand("1,2,4-7,18-21"));
    }
}
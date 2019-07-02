import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void main() {
        Sqrt sqrt1 = new Sqrt(36, 0.000000001);
        assertEquals(6, sqrt1.calc(), 0.000000001);
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {

    @Test
    public void calc() {
        Sqrt one = new Sqrt(27, 0.00000001);
        assertEquals(5.1, one.calc(), 0.1);
    }
}
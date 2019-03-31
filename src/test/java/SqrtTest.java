import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqrtTest {

    @Test
    public void calc() {
        Sqrt sqrt1 = new Sqrt(36, 0.000000001);
        assertEquals(6, sqrt1.calc(), 0.000000001);
    }
}
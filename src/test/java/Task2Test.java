import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void average() {
        assertEquals(2.0, Sqrt.average(2.0, 2.0), 0);
    }

    @Test
    public void calc() {
        double delta = 0.00000001;
        double arg = 16.0;
        Sqrt sqrtTest = new Sqrt(arg, delta);
        assertEquals(4.0, sqrtTest.calc(), delta);
    }
}
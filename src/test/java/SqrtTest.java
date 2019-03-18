import static org.junit.Assert.*;

public class SqrtTest {

    @org.junit.Test
    public void average() {
        double x = 4;
        double y = 2.2;
        double delta = 0.0001;
        Sqrt a = new Sqrt(x, delta);
        assertEquals("Average method is not working", 3.1, a.average (x, y), delta);
    }

    @org.junit.Test
    public void calc() {
        double x = 18.5;
        double delta = 0.00001;
        double expected = 4.30116;
        Sqrt a = new Sqrt(x, delta);
        assertEquals("First check. Calc method is not working", 4.30116, a.calc(), delta);
    }

    @org.junit.Test
    public void calc2() {
        double x = 4.0;
        double delta = 0.00001;
        x = 4.0;
        delta = 0.00001;
        Sqrt b = new Sqrt(x, delta);
        assertEquals("Second check. Calc method is not working", 2, b.calc(), delta);
    }
}
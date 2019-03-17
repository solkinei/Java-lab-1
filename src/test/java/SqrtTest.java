import static org.junit.Assert.*;

public class SqrtTest {

    @org.junit.Test
    public void average() {
        double x = 4;
        double y = 2.2;
        double delta = 0.0001;
        double expected = 3.1;
        Sqrt a = new Sqrt(x, delta);
        double actual = a.average (x, y);
        assertEquals("Average method is not working", expected, actual, delta);
    }

    @org.junit.Test
    public void calc() {
        double x = 18.5;
        double delta = 0.00001;
        double expected = 4.30116;
        Sqrt a = new Sqrt(x, delta);
        double actual = a.calc();
        assertEquals("First check. Calc method is not working", expected, actual, delta);
    }

    @org.junit.Test
    public void calc2() {
        double x = 4.0;
        double delta = 0.00001;
        x = 4.0;
        delta = 0.00001;
        double expected = 2.0;
        Sqrt b = new Sqrt(x, delta);
        double actual = b.calc();
        assertEquals("Second check. Calc method is not working", expected, actual, delta);
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

public class SqrTTest {

    @Test
    public void average() {
        double val = 1.22;
        SqrT sqrt = new SqrT(val);
        double result = sqrt.average(5.0, 7.0);
        double r = 6.0;
        assertEquals(r, result, 0.01);
    }

    @Test
    public void good() {
        double val = 1.22;
        SqrT sqrt = new SqrT(val);
        boolean result = sqrt.good(1.0, 1.0);
        assertEquals(true, result);
    }

    @Test
    public void improive() {
        double val = 1.22;
        SqrT sqrt = new SqrT(val);
        double result = sqrt.improive(1.0,2.0);
        double r = 1.5;
        assertEquals(r, result, 0.1);
    }

    @Test
    public void iter() {
        double val = 1.22;
        SqrT sqrt = new SqrT(val);
        double result = sqrt.iter(1.0, 1.0);
        double r = 1.0;
         assertEquals(r, result, 0.1);
    }

    @Test
    public void calc() {
        double val = 1.22;
        SqrT sqrt = new SqrT(val);
        String result = sqrt.calc("#0.00");
        String r = "1.10";
        assertEquals(r, result);

    }
}
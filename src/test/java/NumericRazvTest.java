import org.junit.Test;

import static org.junit.Assert.*;

public class NumericRazvTest {

    @Test
    public void razvorot() {
        NumericRazv.razvorot("1,2");

    }
    @Test
    public void razvorot1() {
        NumericRazv.razvorot("1,2,3-11");

    }
}
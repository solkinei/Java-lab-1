import org.junit.Test;

import static org.junit.Assert.*;

public class ConvNumRangTest {

    @Test
    public void conv() {
        assertEquals("1-3,5,7,9,20,21", ConvNumRang.conv("1,2,3,5,7,9,20,21"));
        assertEquals("1", ConvNumRang.conv("1"));
        assertEquals("1-10", ConvNumRang.conv("1,2,3,4,5,6,7,8,9,10"));
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

public class SweepNumRangTest {

    @Test
    public void sweep() {
        assertEquals("1,2,3,4,8,10,11,12,13,20,21", SweepNumRang.sweep("1-4,8,10-13,20,21"));
        assertEquals("10", SweepNumRang.sweep("10"));
        assertEquals("5,6,7,8,9,10", SweepNumRang.sweep("5-10"));
    }
}
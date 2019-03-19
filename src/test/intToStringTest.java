import org.junit.Test;

import static org.junit.Assert.*;

public class intToStringTest {

    @Test
    public void intToString() {
        intToString  one = new intToString ();
        assertEquals("1,2,5,7-10,12,15-18,21,25", one.intToString("1,2,5,7,8,9,10,12,15,16,17,18,21,25") );
    }
}
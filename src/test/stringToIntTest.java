import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class stringToIntTest {

    @Test
    public void stringToInt() {
        stringToInt one = new stringToInt();
        ArrayList<Integer> arr = one.stringToInt("0,2-4,5,6,10,11,14-18");
        assertEquals (0, (int) arr.get(0));
        assertEquals (2, (int) arr.get(1));
        assertEquals (3, (int) arr.get(2));
        assertEquals (4, (int) arr.get(3));
        assertEquals (5, (int) arr.get(4));
        assertEquals (6, (int) arr.get(5));
        assertEquals (10, (int) arr.get(6));
        assertEquals (11, (int) arr.get(7));
        assertEquals (14, (int) arr.get(8));
        assertEquals (15, (int) arr.get(9));
        assertEquals (16, (int) arr.get(10));
        assertEquals (17, (int) arr.get(11));
        assertEquals (18, (int) arr.get(12));
    }
}
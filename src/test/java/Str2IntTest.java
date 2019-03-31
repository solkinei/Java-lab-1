import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Str2IntTest {

    @Test
    public void strToInt() {
        assertArrayEquals(new int[]{1, 2, 5, 7, 8, 9, 10, 12, 15, 16, 17, 18, 21, 25}, Str2Int.StrToInt("1,2,5,7-10,12,15-18,21,25"));
        assertArrayEquals(new int[]{25}, Str2Int.StrToInt("25"));
    }
}
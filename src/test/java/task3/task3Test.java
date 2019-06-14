package task3;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public
class task3Test {

    @Test
    public
    void arrSplit () {
        task3 SplitedArr = new task3();
        String s = "1,3,6-8";
        String[] actual = SplitedArr.arrSplit(s);
        String[] expected = new String[]{"1", "3", "6-8"};
        assertTrue(Arrays.deepEquals(expected, actual));
}

    @Test
    public
    void openRange () {
        task3 Range = new task3();
        String[] s = new String[]{"1", "3", "6-8", "10-13"};;
        int[] numbers = new int[]{1, 3, 6, 7, 8, 10, 11, 12, 13};
        assertArrayEquals(
                numbers,
                Range.openRange(s)
        );
    }

}
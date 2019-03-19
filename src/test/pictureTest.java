import org.junit.Test;

import static org.junit.Assert.*;

public class pictureTest {

    @Test
    public void picture() {
        picture one = new picture();
        String [] arr = new String [12];
        for (int i = 0; i < 11; i++)
            arr [i] = "";
        arr = one.picture(arr, '2');
        arr = one.picture(arr, '0');
        assertEquals("******  ******  ", arr[0]);
        assertEquals("     *  *    *  ", arr[1]);
        assertEquals("     *  *    *  ", arr[2]);
        assertEquals("     *  *    *  ", arr[3]);
        assertEquals("     *  *    *  ", arr[4]);
        assertEquals("     *  *    *  ", arr[5]);
        assertEquals("    *   *    *  ", arr[6]);
        assertEquals("   *    *    *  ", arr[7]);
        assertEquals("  *     *    *  ", arr[8]);
        assertEquals(" *      *    *  ", arr[9]);
        assertEquals("******  ******  ", arr[10]);

    }
}
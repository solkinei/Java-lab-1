import org.junit.Test;
import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void expand() {
        assertArrayEquals(new int[]{4,5,6,7},Task3.expand("4-7"));
        assertArrayEquals(new int[]{18},Task3.expand("18"));
    }
}
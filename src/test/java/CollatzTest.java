import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class CollatzTest {

    @Test
    public void col(){
        assertEquals(525, Collatz.lenCollatz(837799));
    }
}

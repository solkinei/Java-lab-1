import static org.junit.Assert.assertEquals;

public class CollatzTest {

    @org.junit.Test
    public void collatz() {
        assertEquals(525, Collatz.collatz(837799));
    }

}
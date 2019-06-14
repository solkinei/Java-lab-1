import static org.junit.Assert.*;

public class CollatsTest {

    @org.junit.Test
    public void main() {
    }

    @org.junit.Test
    public void counter() {
        assertEquals(128, Collats.counter(100000));
    }
    @org.junit.Test
    public void counter2() {
        assertNotEquals(350, Collats.counter(100000));
    }
}
import static org.junit.Assert.*;

public class CollatzeSequenceTest {

    @org.junit.Test(timeout = 50)
    public void collatzNumber() {
        assertEquals(1,CollatzeSequence.collatzNumber(1));
        assertEquals(21,CollatzeSequence.collatzNumber(19));
    }
}
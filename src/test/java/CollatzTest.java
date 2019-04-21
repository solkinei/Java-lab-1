import static org.junit.Assert.*;

public class CollatzTest {

    @org.junit.Test
    public void nextNum() {
        long actual = Collatz.nextNum(4);
        long expectd = 2;
        assertEquals(expectd, actual);

         actual = Collatz.nextNum(3);
         expectd = 10;
        assertEquals(expectd, actual);
    }

    @org.junit.Test
    public void lengthCollatz() {
       long number = 837799;
       int maxlen = 525;
        int actual= Collatz.lengthCollatz(number);
        assertEquals(maxlen, actual);

    }

    @org.junit.Test
    public void maxLengthCollatz() {
        int maxlen = 525;
        int actual= Collatz.maxLengthCollatz();
        assertEquals(maxlen, actual);

    }

}
import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void main() {
        Sqrt test=new Sqrt(81);
        assertEquals(9,test.calc(),0.1);

    }
}
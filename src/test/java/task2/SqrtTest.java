package task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {
    @Test
            public void TestSQET(){
        Sqrt q1 = new Sqrt(10, 0.01);
        assertEquals(3.16, q1.calc(), 0.01);
    }
}
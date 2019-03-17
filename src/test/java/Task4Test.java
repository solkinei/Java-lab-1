import org.junit.Test;

import static org.junit.Assert.*;

public class Task4Test {

    @Test
    public void parseString() {
        String strForParse = "7,15,16,17,1,2,4,5,6,7,18,19,20,8,1,2,3,4";
        String expected = "7,15-17,1,2,4-7,18-20,8,1-4";
        String actual = Task4.parseString(strForParse);
        assertEquals("parseString method is not working", expected, actual);
    }

    @Test
    public void parseString2() {
        String strForParse = "-1,0,1,2,3,4,9,89,79,-89,-88,-87";
        String expected = "-1-4,9,89,79,-89--87";
        String actual = Task4.parseString(strForParse);
        assertEquals("parseString method is not working", expected, actual);
    }

}
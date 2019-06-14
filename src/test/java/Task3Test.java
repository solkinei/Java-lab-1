import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void expandString() throws Exception{
        String strForParse = "1,2,4-7,18-21,22-23";
        String expected = "1,2,4,5,6,7,18,19,20,21,22,23";
        String actual = Task3.expandString(strForParse);
        assertEquals("parseString method is not working", expected, actual);
    }

    @Test
    public void expandString2() throws Exception{
        String strForParse = "1-5";
        String expected = "1,2,3,4,5";
        String actual = Task3.expandString(strForParse);
        assertEquals("parseString method is not working", expected, actual);
    }

    @Test
    public void expandString3() throws Exception{
        String strForParse = "0-5,67,1000,12,500078-500079";
        String expected = "0,1,2,3,4,5,67,1000,12,500078,500079";
        String actual = Task3.expandString(strForParse);
        assertEquals("parseString method is not working", expected, actual);
    }

    @Test
    public void expandStringErr() throws Exception{
        String strForParse = "23-22";
        try {
            String actual = Task3.expandString(strForParse);
            fail("Expected Exception");
        } catch (Exception thrown) {
            assertEquals("The first number in the range should be less, than the second number!",
                    thrown.getMessage());
        }
    }
}
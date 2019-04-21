import org.junit.Test;

import static org.junit.Assert.*;

public class rangeDeployTest {

    @Test
    public void rangeDeploy() {
        String in = "1-3,5";
        assertEquals("1,2,3,5", rangeDeploy.rangeDeploy(in));
    }
}
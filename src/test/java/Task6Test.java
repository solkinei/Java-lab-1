import org.junit.Test;

import static org.junit.Assert.*;

public class Task6Test {

    @Test
    public void earthAndRope() {
        double lengthOfRopePiece = 1;
        double expected = 0.159;
        double actual = Task6.earthAndRope(lengthOfRopePiece);
        assertEquals("earthAndRope method is not working", expected, actual, 0.01);
    }

    @Test
    public void costOfCoverage() {
        double radiusOfPool = 3;
        double widthOfTrack = 1;
        double priceOfSquareMeter = 1000;
        double actual = Task6.costOfCoverage(radiusOfPool, widthOfTrack, priceOfSquareMeter);
        assertEquals("costOfCoverage method is not working", 21991.15, actual, 0.01);
    }

    @Test
    public void costOfFence() {
        double radiusOfPool = 3;
        double widthOfTrack = 1;
        double priceOfRunningMeter = 2000;
        double actual = Task6.costOfFence(radiusOfPool, widthOfTrack, priceOfRunningMeter);
        assertEquals("costOfFence method is not working", 50265.48, actual, 0.01);
    }
}
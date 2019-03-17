import org.junit.Test;

import static org.junit.Assert.*;

public class Task6Test {

    @Test
    public void earthAndRope() {
        double earthRadius = 63781000.0;
        double lengthOfRopePiece = 1;
        double delta = 0.01;
        double expected = 0.159;
        double actual = Task6.earthAndRope(earthRadius, lengthOfRopePiece);
        assertEquals("earthAndRope method is not working", expected, actual, delta);
    }

    @Test
    public void costOfCoverage() {
        double radiusOfPool = 3;
        double widthOfTrack = 1;
        double priceOfSquareMeter = 1000;
        double expected = 21991.15;
        double delta = 0.01;
        double actual = Task6.costOfCoverage(radiusOfPool, widthOfTrack, priceOfSquareMeter);
        assertEquals("costOfCoverage method is not working", expected, actual, delta);
    }

    @Test
    public void costOfFence() {
        double expected = 50265.48;
        double radiusOfPool = 3;
        double widthOfTrack = 1;
        double priceOfRunningMeter = 2000;
        double delta = 0.01;
        double actual = Task6.costOfFence(radiusOfPool, widthOfTrack, priceOfRunningMeter);
        assertEquals("costOfFence method is not working", expected, actual, delta);
    }
}
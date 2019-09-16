import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void setRadius() {
        Circle one = new Circle();
        one.setRadius(100);
        assertEquals(628.3, one.getFerence(),0.1);
        assertEquals(31415.9, one.getArea(),0.1);
    }

    @Test
    public void setFerence() {
        Circle one = new Circle();
        one.setFerence(100);
        assertEquals(15.9, one.getRadius(),0.1);
        assertEquals(795.7, one.getArea(),0.1);
    }

    @Test
    public void setArea() {
        Circle one = new Circle();
        one.setArea(100);
        assertEquals(5.6, one.getRadius(),0.1);
        assertEquals(35.4, one.getFerence(),0.1);
    }
}
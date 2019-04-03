import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void setFerence() {
        Circle circ = new Circle();
        circ.setFerence(1000);
        assertEquals(159, circ.getRadius(), 1);
    }

    @Test
    public void setRadius() {
        Circle circ = new Circle();
        circ.setRadius(300);
        assertEquals(1884, circ.getFerence(), 1);
    }

    @Test
    public void setArea() {
        Circle circ = new Circle();
        circ.setArea(314);
        assertEquals(10,circ.getRadius(),0.01);
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

public class Task6Test {

    @Test
    public void setRadius() {
        Circle c1 = new Circle();
        c1.setRadius(3);
        assertEquals(18.85, c1.getFerence(), 0.01);
    }

    @Test
    public void setFerence() {
        Circle c2 = new Circle();
        c2.setFerence(18.85);
        assertEquals(3, c2.getRadius(), 0.01);
    }

    @Test
    public void setArea() {
        Circle c3 = new Circle();
        c3.setArea(28.26);
        assertEquals(3, c3.getRadius(), 0.01);
    }
}
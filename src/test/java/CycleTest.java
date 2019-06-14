import org.junit.Test;

import static org.junit.Assert.*;

public class CycleTest {
    Cycle krug = new Cycle();

    @Test
    public void setRadius() {
        krug.setRadius(5.69);
        assertEquals((double)5.69, krug.getRadius(), 0.0001);
    }

    @Test
    public void setArea() {
        krug.setArea(5.69);
        assertEquals((double)5.69, krug.getArea(), 0.0001);
    }

    @Test
    public void setFerence() {
        krug.setFerence(5.69);
        assertEquals((double)5.69, krug.getFerence(), 0.0001);
    }

    @Test
    public void getArea() {
        krug.setArea(5.69);
        assertEquals((double)5.69, krug.getArea(), 0.0001);
    }

    @Test
    public void getFerence() {
        krug.setFerence(5.69);
        assertEquals((double)5.69, krug.getFerence(), 0.0001);
    }

    @Test
    public void getRadius() {
        krug.setRadius(5.69);
        assertEquals((double)5.69, krug.getRadius(), 0.0001);
    }

}
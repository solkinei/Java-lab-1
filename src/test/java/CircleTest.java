import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void setRadius() {
        Circle a = new Circle();
        a.setRadius(2);
        double expectedArea = 12.566;
        double expectedFerence = 12.566;
        double delta = 0.01;
        double actualArea = a.getArea();
        double actualFerence = a.getFerence();
        assertEquals("setter of radius is not working, wrong area", expectedArea, actualArea, delta);
        assertEquals("setter of radius is not working, wrong ference", expectedFerence, actualFerence, delta);
    }

    @Test
    public void setFerence() {
        Circle a = new Circle();
        a.setFerence(12.566);
        double expectedRadius = 2;
        double expectedArea = 12.566;
        double delta = 0.01;
        double actualRadius = a.getRadius();
        double actualArea = a.getArea();
        assertEquals("setter of radius is not working, wrong area", expectedArea, actualArea, delta);
        assertEquals("setter of radius is not working, wrong ference", expectedRadius, actualRadius, delta);
    }

    @Test
    public void setArea() {
        Circle a = new Circle();
        a.setArea(12.566);
        double expectedRadius = 2;
        double expectedFerence = 12.566;
        double delta = 0.01;
        double actualRadius = a.getRadius();
        double actualFerence = a.getFerence();
        assertEquals("setter of radius is not working, wrong area", expectedFerence, actualFerence, delta);
        assertEquals("setter of radius is not working, wrong ference", expectedRadius, actualRadius, delta);
    }

    @Test
    public void deltaRadiuses() {
        Circle a = new Circle();
        a.setRadius(2);
        Circle b = new Circle();
        b.setRadius(3);
        assertEquals("deltaRadiuses method is not working", 1, b.deltaRadiuses(a), 0.01);
    }

    @Test
    public void deltaAreas() {
        Circle a = new Circle();
        a.setArea(2);
        Circle b = new Circle();
        b.setArea(3);
        assertEquals("deltaAreas method is not working", 1, b.deltaAreas(a), 0.01);
    }
}
package task6;

import org.junit.Test;

import static org.junit.Assert.*;

public
class task6Test {

    @Test
    public
    void ropeEarth () {
        task6 rope = new task6();
        assertEquals(0.15923, rope.ropeEarth(0.02), 5);
    }

    @Test
    public
    void poolRoad () {
       task6 Road = new task6();
       assertEquals(34540, Road.poolRoad(5),2);

    }

    @Test
    public
    void fencingPrice () {
        task6 Fencing = new task6();
        assertEquals(75360, Fencing.fencingPrice(5), 2);
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

public class Task6Test {

    @Test
    public void main() {
        Circle test=new Circle(10);
        assertEquals(314.2,test.getArea(),0.1);
        assertEquals(62.8,test.getFerence(),0.1);
        test.setFerence(100);
        assertEquals(15.9,test.getRadius(),0.1);
    }

}
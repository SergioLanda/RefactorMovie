/**
 * Created by SergioLanda on 8/25/2016.
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    Circle circle;
@Test
    public void test_calculateArea() {
        circle = new Circle(4);
        assertEquals(circle.calculateArea(), 50.264,0.1);
    }
    @Test
    public void test_calculatePerimeter() {
        circle = new Circle(4);
        assertEquals(circle.calculatePerimeter(), 25.132,0.1);
    }
}

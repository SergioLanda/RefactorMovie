/**
 * Created by SergioLanda on 8/25/2016.
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    Rectangle rectangle;
    @Test
    public void test_calculateArea() {
        rectangle = new Rectangle(2,4);
        double compare = 8;
        assertEquals(rectangle.calculateArea(), compare, 0.1);
    }

    @Test
    public void test_calculatePerimeter() {
        rectangle = new Rectangle(2,4);
        double compare = 12;
        assertEquals(rectangle.calculatePerimeter(), compare, 0.1);
    }
}

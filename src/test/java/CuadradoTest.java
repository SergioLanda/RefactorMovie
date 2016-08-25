/**
 * Created by SergioLanda on 8/25/2016.
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CuadradoTest {

    Cuadrado cuadrado;

    @Test
    public void test_calculateArea() {
        cuadrado = new Cuadrado(2);
        assertEquals(cuadrado.calculateArea(), 4,0.1);
    }
    @Test
    public void test_calculatePerimeter() {
        cuadrado = new Cuadrado(2);
        assertEquals(cuadrado.calculatePerimeter(), 8,0.1);
        assertEquals("", "");
    }


}


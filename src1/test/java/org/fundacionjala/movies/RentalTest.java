package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Test for {@link Rental}
 */
public class RentalTest {
    private static final double DELTA = 0.01;
    private Rental rental;
    private AMovie aMovie;

    @Before
    public void setUp() {
        final int renterDays = 4;
        final String movieName = "Pinocho";
        aMovie = new ChildrenMovie(movieName);
        rental = new Rental(aMovie, renterDays);
    }

    @Test
    public void test_getDaysRented_when() {
        final int expected = 4;
        assertEquals(expected, rental.getDaysRented());
    }

    @Test
    public void test_getMovie_when() {
        assertEquals(aMovie, rental.getMovie());
    }

    @Test
    public void test_calculateAmount_when() {
        final double expected = 3;
        assertEquals(expected, rental.calculateAmount(), DELTA);

    }
}

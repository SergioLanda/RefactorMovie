package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link ChildrenMovie}
 */

public class ChildrenMovieTest {

    public static final double DELTA = 0.1;
    public static final int DAYS_RENTED = 4;

    AMovie aMovie;

    @Test
    public void test_calculateAmount_whenDaysAre4() {
        final double expected = 3;
        aMovie = new ChildrenMovie("Pingocho");
        assertEquals(expected, aMovie.calculateAmount(DAYS_RENTED), DELTA);
    }

    @Test
    public void test_calculatePoints_whenDaysAre4() {
        final double expected = 1;
        aMovie = new ChildrenMovie("Pingocho");
        assertEquals(expected, aMovie.calculatePoints(DAYS_RENTED), DELTA);
    }

}

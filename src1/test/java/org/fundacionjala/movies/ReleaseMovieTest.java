package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link RealeaseMovie}
 */
public class ReleaseMovieTest {
    public static final double DELTA = 0.01;
    AMovie aMovie;

    @Test
    public void test_calculateAmount_when() {
        final double expected = 6;
        aMovie = new RealeaseMovie("Pingocho");
        assertEquals(expected, aMovie.calculateAmount(2), DELTA);
    }
    @Test
    public void test_calculatePoints_when(){
        final double expected=2;
        aMovie =new RealeaseMovie("Pingocho");
        assertEquals(expected,aMovie.calculatePoints(2),DELTA);
    }
}

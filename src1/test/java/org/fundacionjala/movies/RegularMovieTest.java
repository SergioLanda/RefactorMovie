package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link RegularMovie}
 */

public class RegularMovieTest {
    public static final double DELTA = 0.01;
    AMovie aMovie;
    @Test
    public void test_calculateAmount_when(){
        final double expected=5;
        aMovie =new RegularMovie("Pingocho");
        assertEquals(expected,aMovie.calculateAmount(4), DELTA);
    }

    @Test
    public void test_calculatePoints_when(){
        aMovie=new RegularMovie("Pingocho");
        final double expected=1;
        assertEquals(expected,aMovie.calculatePoints(4),DELTA);
    }
}

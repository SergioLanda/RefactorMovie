package org.fundacionjala.movies;

/**
 * Created by SergioLanda on 8/24/2016.
 */
public class RealeaseMovie extends AMovie {
    public RealeaseMovie(String movie) {
        super(movie);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount(int daysRented) {
        double thisAmount = daysRented * 3;
        return thisAmount;
    }
    /**
     * {@inheritDoc}
     */
    public int calculatePoints(int daysRented) {
        int points = 1;
        if (daysRented > 1) ++points;
        return points;
    }
}

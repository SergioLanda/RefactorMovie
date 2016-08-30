package org.fundacionjala.movies;

/**
 * Created by SergioLanda on 8/24/2016.
 */
public class ChildrenMovie extends AMovie {
    public ChildrenMovie(String movie) {
        super(movie);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;
        return thisAmount;
    }
    /**
     * {@inheritDoc}
     */
    public int calculatePoints(int daysRented) {
        return 1;
    }
}

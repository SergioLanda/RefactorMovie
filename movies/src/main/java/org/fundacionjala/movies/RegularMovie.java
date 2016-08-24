package org.fundacionjala.movies;

/**
 * Created by SergioLanda on 8/24/2016.
 */
public class RegularMovie extends AMovie {
    public RegularMovie(String movie) {
        super(movie);
    }

    @Override
    public double calculateAmount(int daysRented) {
        double thisAmount = 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;
        return thisAmount;
    }

    public int calculatePoints(int daysRented) {
        return 1;
    }
}

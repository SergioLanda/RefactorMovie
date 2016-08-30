package org.fundacionjala.movies;

/**
 * Created by SergioLanda on 8/24/2016.
 */
public abstract class AMovie {

    private String title;

    /**
     * this calculate the total amount of a movie rented
     * @param daysRented the days of the movie rental
     * @return total amount
     */
    public abstract double calculateAmount(int daysRented);

    /**
     * this calculate the total points of a movie rented
     * @param daysRented the days of the movie rental
     * @return total points
     */
    public abstract int calculatePoints(int daysRented);

    public AMovie(String movie) {
        this.title = movie;
    }

    /**
     * obtains of a title of a movie
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

}

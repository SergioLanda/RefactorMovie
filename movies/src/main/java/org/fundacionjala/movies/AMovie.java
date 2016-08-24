package org.fundacionjala.movies;

/**
 * Created by SergioLanda on 8/24/2016.
 */
public abstract class AMovie {

    private String title;

    public abstract double calculateAmount(int daysRented);

    public abstract int calculatePoints(int daysRented);

    public AMovie (String movie) {
      this.title = movie;
    }

    public String getTitle() {
        return this.title;
    }

}

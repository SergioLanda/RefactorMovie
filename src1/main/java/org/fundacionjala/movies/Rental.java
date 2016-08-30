package org.fundacionjala.movies;

class Rental {
    private AMovie movie;
    private int daysRented;

    public Rental(AMovie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * this return Days of rental
     * @return days of rental
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * obtains a movie
     * @return a movie
     */
    public AMovie getMovie() {
        return this.movie;
    }

    /**
     * obtain the calculate of total amount
     * @return the total amount
     */
    public double calculateAmount() {
        double thisAmount = movie.calculateAmount(daysRented);
        return thisAmount;
    }
}
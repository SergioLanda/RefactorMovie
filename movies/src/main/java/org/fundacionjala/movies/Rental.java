package org.fundacionjala.movies;

class Rental {
    private AMovie movie;
    private int daysRented;

    public Rental(AMovie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public AMovie getMovie() {
        return this.movie;
    }

    public double calculateAmount() {
        double thisAmount = movie.calculateAmount(daysRented);
        return thisAmount;
    }
}
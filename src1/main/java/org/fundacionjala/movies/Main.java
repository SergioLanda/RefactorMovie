package org.fundacionjala.movies;

public class Main {
    public static void main(String[] args) {
        RentalCustomer rentalCustomer = new RentalCustomer(new Customer("bla"));
        rentalCustomer.addRental(new Rental(new RealeaseMovie("The Revenant"), 2));
        rentalCustomer.addRental(new Rental(new RegularMovie("Terminator"), 2));
        System.out.println(rentalCustomer.statement());
    }
}

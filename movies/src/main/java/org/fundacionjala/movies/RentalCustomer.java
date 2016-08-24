package org.fundacionjala.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SergioLanda on 8/24/2016.
 */
public class RentalCustomer {
    private static final String BREAK_LINE = "\n";
    List<Rental> listRentals=new ArrayList<Rental>();
    Customer customer;
    public RentalCustomer(Customer customer){
        this.customer=customer;
    }

    public void addRental(Rental rental) {
        listRentals.add(rental);
    }

    public int calculateTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : listRentals) {
            frequentRenterPoints += rental.getMovie().calculatePoints(rental.getDaysRented());
        }
        return frequentRenterPoints;
    }

    public double calculateTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : listRentals) {
            //determine amounts for each line
            totalAmount += rental.calculateAmount();
        }
        return totalAmount;
    }

    public String statement() {
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for ");
        result.append(customer.getName());
        result.append(BREAK_LINE);
        for (Rental rental : listRentals) {
            //show figures for this rental
            result.append("\t");
            result.append(rental.getMovie().getTitle());
            result.append("\t");
            result.append(rental.calculateAmount());
            result.append(BREAK_LINE);
        }
        //add footer lines
        result.append("Amount owed is ");
        result.append(calculateTotalAmount());
        result.append(BREAK_LINE);
        result.append("You earned ");
        result.append(calculateTotalFrequentRenterPoints());
        result.append(" frequent renter points");
        return result.toString();
    }
}

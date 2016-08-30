package org.fundacionjala.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SergioLanda on 8/24/2016.
 */
public class RentalCustomer {
    private static final String BREAK_LINE = "\n";
    private final List<Rental> listRentals = new ArrayList<Rental>();
    private final Customer customer;

    public RentalCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * add a rental to a list
     * @param rental
     */
    public void addRental(Rental rental) {
        listRentals.add(rental);
    }

    /**
     * obtain the total points
     * @return total points
     */
    public int calculateTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : listRentals) {
            frequentRenterPoints += rental.getMovie().calculatePoints(rental.getDaysRented());
        }
        return frequentRenterPoints;
    }

    /**
     * obtain the total amount
     * @return total amount
     */
    public double calculateTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : listRentals) {
            totalAmount += rental.calculateAmount();
        }
        return totalAmount;
    }

    /**
     * obtain the descriptive statement of the totals
     * @return a descriptive statement of the totals
     */
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

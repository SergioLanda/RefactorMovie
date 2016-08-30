package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link RentalCustomer}
 */
public class RentalCustomerTest {
    private RentalCustomer rentalCustomer;
    @Before
    public void setUp(){
        final String name="Thatsall";
        final String titleMovie="Vendeta";
        final int rentalDays=7;
        rentalCustomer=new RentalCustomer(new Customer(name));
        rentalCustomer.addRental(new Rental(new RegularMovie(titleMovie),rentalDays));
    }
    @Test
    public void test_calculateTotalFrequentRenterPoints_when(){
        final int expected=1;
        assertEquals(expected,rentalCustomer.calculateTotalFrequentRenterPoints());
    }
    @Test
    public void test_calculateTotalAmount_when(){
        final double expected=9.5;
        assertEquals(expected,rentalCustomer.calculateTotalAmount(),0.01);
    }
}

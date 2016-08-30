package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Customer}
 */
public class CustomerTest {
    private Customer customer;

    @Before
    public void setUp() {
        final String customerName = "Thatsall";
        customer = new Customer(customerName);
    }

    @Test
    public void test_getName_when() {
        final String expected = "Thatsall";
        assertEquals(expected, customer.getName());
    }
}

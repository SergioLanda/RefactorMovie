package org.fundacionjala.movies;

class Customer {

    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    /**
     * this obtains a customer name
     * @return the name of the customer
     */
    public String getName() {
        return name;
    }
}

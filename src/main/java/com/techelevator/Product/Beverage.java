package com.techelevator.Product;



import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Beverage extends Product {
    private static final BigDecimal BEVERAGE_BASE_COST = new BigDecimal("1.50");
    private int numberOfBevs;


    public Beverage(String type, int bevCount) {
        super(type);
        this.numberOfBevs = bevCount;

    }

    public int getNumberOfBevs() {
        return this.numberOfBevs;

    }

    @Override
    public void getSound() {
        System.out.println("Glug glug yum");

    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal bevCount = BigDecimal.valueOf(getNumberOfBevs());
        BigDecimal total = BigDecimal.ZERO;
        total = total.add(BEVERAGE_BASE_COST.multiply(bevCount));

        return total;
    }

    Map<String, String> beverageItems = new HashMap<String, String>() {{


    }};


}



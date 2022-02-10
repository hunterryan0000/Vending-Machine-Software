package com.techelevator.Product;

import com.techelevator.App.displayItems;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Beverage extends Product implements displayItems {
    private static final BigDecimal BASE_COST = new BigDecimal("1.50");
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
        total = total.add(BASE_COST.multiply(bevCount));

        return total;
    }

    Map<String, String> beverageItems = new HashMap<String, String>() {{
            displayItems.put("D1", "Coca Cola");
            displayItems.put("D2", "Sprite");
            displayItems.put("D3", "Gatorade");
            displayItems.put("D4", "Dr. Pepper");
        }};
}



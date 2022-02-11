package com.techelevator.Product;



import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Chips extends Product{
    private static final BigDecimal BASE_COST = new BigDecimal("0.75");
    private int bagsOfChips;


    public Chips(String type, int chipCount) {
        super(type);
        this.bagsOfChips = chipCount;

    }

    public int getBagsOfChips() {
        return this.bagsOfChips;

    }

    @Override
    public void getSound() {
        System.out.println("Crunch crunch yum");

    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal chipCount = BigDecimal.valueOf(getBagsOfChips());
        BigDecimal total = BigDecimal.ZERO;
        total = total.add(BASE_COST.multiply(chipCount));

        return total;
    }

}

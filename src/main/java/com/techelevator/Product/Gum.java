package com.techelevator.Product;



import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Gum extends Product{
    private static final BigDecimal BASE_COST = new BigDecimal("0.50");
    private int packsOfGum;


    public Gum(String type, int gumCount) {
        super(type);
        this.packsOfGum = gumCount;

    }

    public int getPacksOfGum() {
        return this.packsOfGum;

    }

    @Override
    public void getSound() {
        System.out.println("Chew chew yum");

    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal gumCount = BigDecimal.valueOf(getPacksOfGum());
        BigDecimal total = BigDecimal.ZERO;
        total = total.add(BASE_COST.multiply(gumCount));

        return total;
    }
}

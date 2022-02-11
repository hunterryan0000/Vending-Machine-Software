package com.techelevator.Product;



import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Candy extends Product {
    private static final BigDecimal CANDY_BASE_COST = new BigDecimal("1.00");
    private int piecesOfCandy;


    public Candy(String type, int candyCount) {
        super(type);
        this.piecesOfCandy = candyCount;

    }

    public int getNumberOfCandy() {
        return this.piecesOfCandy;

    }

    @Override
    public void getSound() {
        System.out.println("Munch munch yum");

    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal candyCount = BigDecimal.valueOf(getNumberOfCandy());
        BigDecimal total = BigDecimal.ZERO;
        total = total.add(CANDY_BASE_COST.multiply(candyCount));

        return total;
    }

}

package com.techelevator.Product;

import java.math.BigDecimal;
import java.util.HashMap;

public abstract class Product {
    public String type;

    public Product(String type) {
        this.type = type;
    }
    public abstract BigDecimal getPrice();

public abstract void getSound();


}
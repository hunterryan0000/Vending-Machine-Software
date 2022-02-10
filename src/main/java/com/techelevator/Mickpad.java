package com.techelevator;
import java.util.Scanner;

public class Mickpad {

    /////////////////////////////
    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println("Choose your option:  ");
    }
    public static void main(String[] args) {
        String[] options = {
                "A1 --Snickers Bar",
                "A2 --Snickers Bar with Almonds",
                "A3 --Reese’s Peanut Butter Cups",
                "A4 --Hershey Bar",
                "A5 --Hershey Bar with Almonds",
                "B1 --Wrigly's Spearment",
                "B2 --Buble Yum Bubble Gum",
                "B3 --Wrigley's Juicy Fruit",
                "B4 --Dentyne Ice",
                "B5. --Orbit Wintermint",
                "C1 --Lay's Classic",
                "C2 --Ruffles",
                "C3 --Doritos",
                "C4 --Sun Chips",
                "C5 --Frito's ",
                "D1. --Dr. Pepper",
                "D2. --Coca Cola",
                "D3. --Diet Dr. Pepper",
                "D4. --Diet Coca Cola",
                "D5. --7-Up",
        };
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 25) {
            printMenu(options);
            try {
                option = Scanner(System.)
            }
        }
    }
}
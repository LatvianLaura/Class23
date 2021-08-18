package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        //Write a new program for actions with HashMap and HashTable.
        //●      Create a HashMap for the product price page where all products will be as the key and the price as the value.
        //●      Save at least 8 products in the HashMap.
        //●      Find out how many products are under 1 eur.
        //●      Find out which product price is the lowest.
        //●      Find out which product price is the largest.
        //●      Create a new HashMap with other products. Merge both HashMaps and print out how many products are in the merged HashMap.
        //●      *Sort all values in ascending order.
        //●      Repeat the same tasks with HashTable.

        HashMap<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Apple", 1);
        productPrices.put("Milk", 2);
        productPrices.put("Cheese", 6);
        productPrices.put("Computer", 900);
        productPrices.put("Couch", 500);
        productPrices.put("Chocolate", 1);
        productPrices.put("Mobile phone", 400);
        productPrices.put("Sour cream", 1);

        HashMap<String, Integer> productPrices2 = new HashMap<>();
        productPrices2.put("Ice cream", 2);
        productPrices2.put("Shrimps", 13);
        productPrices2.put("Car", 19699);


        int counterPricesBelow1 = 0;
        for (Integer price: productPrices.values() ) {
            if (price <= 1) {
                counterPricesBelow1++;
            }
        }
        System.out.println("There are  "+ counterPricesBelow1 + " items eaqual/below 1 eur");


        int lowest = 1000;
        for (Integer price1: productPrices.values()) {
            if(price1 < lowest){
                lowest = price1;
            }
        }
        System.out.println("lowest price is: " + lowest);

        for (String productName: productPrices.keySet()){
            if (productPrices.get(productName)==lowest) {
                System.out.println(productName + " has the lowest price");
            }
        }
        System.out.println("______________________________________");

        int highest = 0;
        for (Integer price2: productPrices.values()) {
            if(price2 > highest){
                highest = price2;
            }
        }
        System.out.println("highest price is: " + highest);

        for (String productName: productPrices.keySet()){
            if (productPrices.get(productName)==highest) {
                System.out.println(productName + " has the highest price");
            }
        }
        System.out.println("______________________________________");

        productPrices.putAll(productPrices2);
        System.out.println(productPrices);

        System.out.println("______________________________________");

        productPrices.values().stream().sorted().forEach(System.out::println);

    }
}
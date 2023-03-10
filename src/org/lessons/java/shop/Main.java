package org.lessons.java.shop;

import org.lessons.java.shop.Product;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("orologio", 400, "un oggetto che indica l'ora corrente");

        product1.printDetailsProduct();

        Product product2 = new Product();

        product2.setName("braccialetto");
        product2.setDescription("un oggetto che si indossa al polso");
        product2.setBasePrice(45.50);

        product2.printDetailsProduct();


    }
}
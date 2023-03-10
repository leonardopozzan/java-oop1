package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Product {
    private int code;
    private String name;
    private String description;
    private double basePrice;
    private final static double IVA = 0.22;

    public Product(String name, double price ,String description) {
        Random random = new Random();
        this.code = random.nextInt(1000000);
        this.name = name;
        this.basePrice = price;
        this.description = description;
    }

    public Product() {
        this("",0,"");
    }

    public static double getIVA(){
        return IVA;
    }
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getFullPrice() {
        double fullPrice = this.basePrice + this.basePrice * IVA;
        return fullPrice;
    }
    public String getFullName(){
        return this.code + this.name;
    }
    public String getFormattedCode(){
        String pattern = "00000000";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String format = decimalFormat.format(this.code);
        return  format;
    }

    public void printDetailsProduct(){
        System.out.println("\nEcco il tuo oggetto\n");
        System.out.println("IVA: " + this.getIVA());
        System.out.println("Codice: " + this.getCode());
        System.out.println("Nome: " + this.getName());
        System.out.println("Descrizione: " + this.getDescription());
        System.out.println("Prezzo base: " + this.getBasePrice());
        System.out.println("Prezzo completo: " + this.getFullPrice());
        System.out.println("Nome completo: " + this.getFullName());
        System.out.println("Codice formattato: " + this.getFormattedCode());
    }
}

package edu.poniperro.items;

public class Item {
    private String name;
    private Double price;
    private String extra;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, Double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }
}

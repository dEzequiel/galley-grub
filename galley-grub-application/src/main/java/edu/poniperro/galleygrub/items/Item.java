package edu.poniperro.galleygrub.items;

public class Item implements Product{
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

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Double price() {
        return this.price;
    }

    @Override
    public String extra() {
        return this.extra;
    }

    // @Override
    // public Boolean isRegular()

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append(this.name).append("....").append(this.price().toString());

        return output.toString();
    }

}

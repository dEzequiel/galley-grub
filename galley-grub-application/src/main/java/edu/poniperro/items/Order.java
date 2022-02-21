package edu.poniperro.items;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda{
    private Double total;
    private List<Item> items = new ArrayList<>();

    public Order(){};

    @Override
    public void addItem(String name, Double price) {
        Item item = new Item(name, price);
        items.add(item);
    }

    @Override
    public void addItem(String name, Double price, String extra) {
        Item item = new Item(name, price, extra);
        items.add(item);
    }

    @Override
    public List<Item> itemList() {
        return this.items;
    }

    @Override
    public int size() {
        return this.itemList().size();
    }

}

package edu.poniperro.galleygrub.items;

public class Item implements Product {
    private String name;
    private Double price;
    private String extra = null;

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

    @Override
    public Boolean isRegular() {
        return this.extra == null;
    }

    @Override
    public String toString() {

        // init extras prices dict to get key
        Prices.initPricesDict();

        StringBuilder output = new StringBuilder();

        if (this.isRegular()) {
            output.append(this.name).append("....").append(this.price().toString()).append("$");
            return output.toString();
        } else {
            output.append(this.name).append(" w/ ").append(this.extra).append("....").append(this.price().toString()).append("$").append(" + ").append(Prices.getPricesDict().get(extra())).append("$");
            return output.toString();
        }
    }

    // The default implementation of equals() in the class Object says that equality
    // is the same as object identity. And income and expenses are two distinct instances.

    // The two objects will be equal if they share the same memory address.

    // Objects are equal when they have the same state (usually comparing variables). Objects are identical when they share the class identity.
    // For example, the expression obj1==obj2 tests the identity, not equality. While the expression obj1.equals(obj2) compares equality.

    public boolean equals(Object obj) {
        // Are the same?
        if (this == obj) {
            return true;
        }
        // obj is a null reference
        if (obj == null) {
            return false;
        }
        // different objects classes
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        return this.name() == ((Item) obj).name();
    };

    // hashCode() returns an integer representing the current instance of the class.
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

}

package edu.poniperro.galleygrub.items;

import java.util.HashMap;
import java.util.Map;

public class Prices {

    // Pices map initialization.
    private final static Map<String, Double> Prices = new HashMap<>();

    public static void initPricesDict() {
            Prices.put("cheese", 0.25);
            Prices.put("sauce", 0.50);
            Prices.put("medium", 0.25);
            Prices.put("large", 0.50);
    }

    public static Map<String, Double> getPricesDict() {
        return Prices;
    }

    private static String createOutput() {
        StringBuilder output = new StringBuilder();

        for (Map.Entry<String, Double> entry : getPricesDict().entrySet()) {
            output.append(entry.getKey()).append(" ").append(entry.getValue().toString()).append('$').append("\n");
        }

        return output.toString();
    }

    public static void display() {
        System.out.print(createOutput());
    }
};

package edu.poniperro.items;

import java.util.HashMap;
import java.util.Map;

public class Prices {

    // Pices map initialization.
    private static final Map<String, Double> pricesDict = new HashMap<>();

    public void initPricesDict() {
            pricesDict.put("cheese", 0.25);
            pricesDict.put("sauce", 0.50);
            pricesDict.put("medium", 0.25);
            pricesDict.put("large", 0.50);
    }

    static Map<String, Double> getPricesDict() {
        return pricesDict;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();

        for (Map.Entry<String, Double> entry : getPricesDict().entrySet()) {
            output.append(entry.getKey()).append(" ").append(entry.getValue().toString()).append('$').append("\n");
        }

        return output.toString();
    }
};

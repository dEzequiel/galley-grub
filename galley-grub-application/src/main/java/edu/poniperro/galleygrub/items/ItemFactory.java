package edu.poniperro.galleygrub.items;

import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class ItemFactory {

    private static Set<Item> itemMap = new HashSet<>();

    public ItemFactory(){};

    public static Item getItem(String name, double price) {
        Optional<Item> desiredItem = itemMap.stream()
                                                    .filter(i -> i.isRegular() && Objects.equals(i.name(), name))
                                                    .findFirst();

        if(desiredItem.isPresent()) {
            return desiredItem.get();
        } else {
            Item desiredItemCreation = new Item(name, price);
            itemMap.add(desiredItemCreation);
            return desiredItemCreation;
    }
        }

        public static Item getItem(String name, double price, String extra) {
            Optional<Item> desiredItem = itemMap.stream()
                                                        .filter(i -> !i.isRegular() && Objects.equals(i.name(), name))
                                                        .findFirst();
            if (desiredItem.isPresent()) {
                return desiredItem.get();
            } else {
                Item desiredItemCreation = new Item(name, price, extra);
                itemMap.add(desiredItemCreation);
                return desiredItemCreation;
            }
        }

        public static void clear() {
            itemMap.clear();
        }

        public static int size() {
            return itemMap.size();
        }
}

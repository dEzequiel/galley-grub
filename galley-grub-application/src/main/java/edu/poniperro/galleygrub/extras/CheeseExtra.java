package edu.poniperro.galleygrub.extras;

import java.util.List;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.order.Comanda;

public class CheeseExtra extends Extra {
    private final Double CHEESE_PRICE = 0.25;

    public CheeseExtra(){
        extraProduct = CHEESE;
    };

    public void sumExtra(Comanda comanda) {
        List<Item> items = comanda.itemList();
        for (Item item : items) {
            if (item.extra() == extraProduct) {
                comanda.updateTotal(CHEESE_PRICE);
            }
        }

        nextExtra.ifPresent(extra -> nextExtra.get().sumExtra(comanda));
    }


}

package edu.poniperro.galleygrub.extras;

import java.util.List;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.order.Comanda;

public class SauceExtra extends Extra{

    private final Double SAUCE_PRICE = 0.50;

    public SauceExtra() {
        extraProduct = SAUCE;
    }

    public void sumExtra(Comanda comanda) {
        List<Item> items = comanda.itemList();
        for (Item item : items) {
            if (item.extra() == extraProduct) {
                comanda.updateTotal(SAUCE_PRICE);
            }
        }

        nextExtra.ifPresent(extra -> nextExtra.get().sumExtra(comanda));
    }
}

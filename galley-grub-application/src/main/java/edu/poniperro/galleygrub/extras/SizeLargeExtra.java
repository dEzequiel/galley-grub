package edu.poniperro.galleygrub.extras;

import java.util.List;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.order.Comanda;

public class SizeLargeExtra extends Extra{

    private final Double SIZE_PRICE = 0.50;

    public SizeLargeExtra(){
        extraProduct = SIZE_LARGE;
    }


    public void sumExtra(Comanda comanda) {
        List<Item> items = comanda.itemList();
        for (Item item : items) {
            if (item.extra() == extraProduct) {
                comanda.updateTotal(SIZE_PRICE);
            }
        }

        nextExtra.ifPresent(extra -> nextExtra.get().sumExtra(comanda));
    }
}

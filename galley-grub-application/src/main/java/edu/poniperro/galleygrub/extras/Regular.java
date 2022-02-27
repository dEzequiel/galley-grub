package edu.poniperro.galleygrub.extras;

import java.util.List;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.order.Comanda;

public class Regular extends Extra{

    public Regular(){};

    public void sumExtra(Comanda comanda) {
        List<Item> items = comanda.itemList();
        for (Item item : items) {
            if (item.extra() == extraProduct) {
                comanda.updateTotal(item.price());
            }
        }

        nextExtra.ifPresent(extra -> nextExtra.get().sumExtra(comanda));
    }


}

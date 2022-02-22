package edu.poniperro.galleygrub.items;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.poniperro.galleygrub.order.Order;

public class ItemFactoryTest {

    @Test
    public void understandItemFactoryBehaviour() {

        Item kpatty = ItemFactory.getItem("Krabby Patty", 1.25);
        assertNotNull(kpatty);

        assertEquals("Krabby Patty....1.25$", kpatty.toString());
        assertEquals(1, ItemFactory.size());

        Item coral = ItemFactory.getItem("Coral Bits", 1.00);
        assertNotNull(kpatty);

        assertEquals(kpatty, ItemFactory.getItem("Krabby Patty", 1.25));
        assertEquals(coral, ItemFactory.getItem("Coral Bits", 1.00));

        assertEquals(2, ItemFactory.size());
        ItemFactory.clear();
        assertEquals(0, ItemFactory.size());
    }
}

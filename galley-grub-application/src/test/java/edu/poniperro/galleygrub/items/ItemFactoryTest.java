package edu.poniperro.galleygrub.items;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import edu.poniperro.galleygrub.order.Order;

public class ItemFactoryTest {

    @Before
    public void setuItemFactory() {
        ItemFactory.clear();
        assertEquals(0, ItemFactory.size());
    }
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

    }

    @Test
    public void understandNotRegularItemBehaviour() {
        Item kpatty = ItemFactory.getItem("Krabby Patty", 1.25, "cheese");
        assertNotNull(kpatty);

        assertEquals(1, ItemFactory.size());

        assertEquals(kpatty, ItemFactory.getItem("Krabby Patty", 1.25, "cheese"));
        assertEquals("Krabby Patty w/ cheese....1.25$ + 0.25$", kpatty.toString());

        assertNotNull(ItemFactory.getItem("Krabby Patty", 1.25, "cheese"));


    }
}

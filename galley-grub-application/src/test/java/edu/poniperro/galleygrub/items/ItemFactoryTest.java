package edu.poniperro.galleygrub.items;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


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

    @Test
    public void getPresentItems() {
        Item item = ItemFactory.getItem("Krabby Patty", 1.25);
        Item itemClon = ItemFactory.getItem("Krabby Patty", 1.25);

        assertEquals(1, ItemFactory.size());

        assertTrue(item == itemClon);
    }

    @Test
    public void getPresentItemsWithExtra() {
        Item item = ItemFactory.getItem("Krabby Patty", 1.25, "cheese");
        Item itemClon = ItemFactory.getItem("Krabby Patty", 1.25, "cheese");

        assertEquals(1, ItemFactory.size());

        assertTrue("Not the same hashCode", item.equals(itemClon));
        assertTrue("Not the same hashCode", item.hashCode() == itemClon.hashCode());

        Item itemClonDIffExtra = ItemFactory.getItem("Krabby Patty", 1.25, "sauce");

        assertTrue("The same hashCode", item.hashCode() != itemClonDIffExtra.hashCode());

        assertTrue("Not the same object", item == itemClon);
        assertFalse("Same object", item == itemClonDIffExtra);

        assertEquals(2, ItemFactory.size());

        Item item3 = ItemFactory.getItem("Krabby Patty", 1.25, "cheese");
        Item itemClon3 = ItemFactory.getItem("Patty", 1.25, "sauce");

        assertFalse("Same object", item3.equals(itemClon3));


    }

    @Test
    public void differentHashCodes() {
        Item kpattywc = ItemFactory.getItem("Krabby Patty", 1.25, "cheese");
        Item kpatty = ItemFactory.getItem("Krabby Patty", 1.25);

        assertNotSame(kpattywc.hashCode(), kpatty.hashCode());

    }

    @Test
    public void getRegularExtraItemTest() {

        Item kpattywc = ItemFactory.getItem("Krabby Patty", 1.25, "cheese");
        assertNotNull(kpattywc);
        assertEquals(1, ItemFactory.size());

        Item kpatty = ItemFactory.getItem("Krabby Patty", 1.25);
        assertNotSame(kpattywc,kpatty);
        assertEquals(2, ItemFactory.size());

    }

}

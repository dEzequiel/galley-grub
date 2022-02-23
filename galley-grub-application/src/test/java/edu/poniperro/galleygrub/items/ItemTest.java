package edu.poniperro.galleygrub.items;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class ItemTest {


    @Test
    public void checkItemObjectsIdentity() {

        // compared objects are exactly the same
        Item item = new Item("foo", 1.00);
        Item item1_identifcal = new Item("foo", 1.00);
        assertTrue(item.equals(item1_identifcal));
        assertTrue("Not the same", item.equals(item));

        // objects are from different classes
        Item item2 = new Item("foo", 1.00);
        Order order = new Order();

        assertFalse("Same class", item2.equals(order));


    }
}

package edu.poniperro.galleygrub.order;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.poniperro.galleygrub.order.Order;

public class OrderTest {

    @Test
    public void orderElements() {

        Order order = new Order();

        order.addItem("Krabby Patty", 0.00);
        order.addItem("Coral Bits", 0.00);

        assertEquals(2, order.size());

        assertNotNull(order.itemList());

    }

    @Test
    public void checkItemsPriceSum() {

        Order order = new Order();

        order.addItem("Krabby Patty", 1.25);
        order.addItem("Coral Bits", 1.00);
        order.addItem("Kelp Rings", 1.5);
        order.addItem("Golden Loaf", 2.0);
        order.addItem("Seafoam Soda", 1.0);

        assertEquals(6.75, order.getTotal(), 0);
    }

}

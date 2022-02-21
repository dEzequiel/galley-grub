package edu.poniperro.galleygrub.items.order;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.poniperro.galleygrub.order.Order;

public class OrderTest {

    @Test
    public void orderElements() {

        Order order= new Order();

        order.addItem("Krabby Patty", 1.25);
        order.addItem("Coral Bits", 1.00);

        assertEquals(2, order.size());

        assertNotNull(order.itemList());

    }


}

package edu.poniperro.galleygrub.receipt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.poniperro.galleygrub.order.Comanda;
import edu.poniperro.galleygrub.order.Order;

public class ReceiptTest {

    @Test
    public void checkOrderFromReceipt() {

        Comanda order = new Order();

        order.addItem("Krabby Patty", 1.25);
        order.addItem("Coral Bits", 1.00);
        order.addItem("Kelp Rings", 1.5);
        order.addItem("Golden Loaf", 2.0);
        order.addItem("Seafoam Soda", 1.0);

        assertEquals(5, order.size());

        Ticket receipt = new Receipt(order);

        assertEquals(5, receipt.getOrder().size());
    }
}

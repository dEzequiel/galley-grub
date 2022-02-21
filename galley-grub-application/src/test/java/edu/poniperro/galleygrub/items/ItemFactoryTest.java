package edu.poniperro.galleygrub.items;

import org.junit.Test;

import edu.poniperro.galleygrub.order.Order;

public class ItemFactoryTest {

    @Test
    public void understandItemFactoryBehaviour() {
        Order order= new Order();

        order.addItem("Krabby Patty", 1.25);
        order.addItem("Coral Bits", 1.00);

        
    }
}

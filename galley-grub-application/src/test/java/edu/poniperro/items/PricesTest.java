package edu.poniperro.items;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class PricesTest {

    @Test
    public void pricesInit() {

        Prices prices = new Prices();
        prices.initPricesDict();

        assertNotNull(prices.getPricesDict());
        assertEquals(4, prices.getPricesDict().size());
    }
}

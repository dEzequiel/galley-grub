package edu.poniperro.items;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.poniperro.galleygrub.items.Prices;

public class PricesTest {

    @Test
    public void pricesInit() {

        Prices.initPricesDict();

        assertNotNull(Prices.getPricesDict());
        assertEquals(4, Prices.getPricesDict().size());
    }
}

package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.items.Comanda;
import edu.poniperro.galleygrub.items.Order;

public class Receipt implements Ticket{

    private Double total;
    private final Comanda order = new Order();

    public Receipt (Comanda order){};

    @Override
    public Comanda getOrder() {
        return this.order;
    }

    


}

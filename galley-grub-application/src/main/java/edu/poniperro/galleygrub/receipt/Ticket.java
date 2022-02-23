package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.items.Comanda;

public interface Ticket {
    Comanda getOrder();
    Double total();
    void print();
}

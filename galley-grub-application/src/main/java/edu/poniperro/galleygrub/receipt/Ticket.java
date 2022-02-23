package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.extras.Extra;
import edu.poniperro.galleygrub.order.Comanda;

public interface Ticket {
    Comanda getOrder();
    Double total();
    void print();
    void setChain(Extra extraType);
    Extra getChain();
}

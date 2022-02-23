package edu.poniperro.galleygrub.receipt;

import java.util.stream.Collectors;

import edu.poniperro.galleygrub.extras.Extra;
import edu.poniperro.galleygrub.order.Comanda;
import edu.poniperro.galleygrub.order.Order;

public class Receipt extends Extra implements Ticket {

    private Double total;
    private Comanda order = new Order();

    public Receipt (Comanda order){
        this.order = order;
    };

    @Override
    public Comanda getOrder() {
        return this.order;
    }

    @Override
    public Double total() {
        return order.getTotal();
    }

    @Override
    public void print() {
        StringBuilder totalOutput = new StringBuilder();
        totalOutput.append("TOTAL....").append(total().toString()).append("$");

        System.out.println(totalOutput.toString());

    }



}

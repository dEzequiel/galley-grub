package edu.poniperro.galleygrub.extras;

import java.util.Optional;

import edu.poniperro.galleygrub.order.Comanda;

public abstract class Extra {
    static final String CHEESE = "cheese";
    static final String SAUCE = "sauce";
    static final String SIZE_LARGE = "size large";

    String extraProduct;
    Optional<Extra> nextExtra;

    public Extra(){}

    public void setNextExtra(Extra extraType) {
        this.nextExtra = Optional.of(extraType);
    };

    public abstract void sumExtra(Comanda extraPrice);

}

package edu.poniperro.galleygrub.extras;

import java.util.Optional;

public abstract class Extra {
    static final String CHEESE = "cheese";
    static final String SAUCE = "sauce";
    static final String SIZE_LARGE = "size large";

    String extraProduct;
    Optional<Extra> nextExtra;

    
}

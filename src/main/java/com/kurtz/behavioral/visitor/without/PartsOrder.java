package com.kurtz.behavioral.visitor.without;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by P on 21.09.2016.
 */
public class PartsOrder implements AtvPart {
    private List<AtvPart> parts = new ArrayList<>();

    public void addPart(AtvPart atvPart) {
        parts.add(atvPart);
    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(parts);
    }

    @Override
    public double calculateShipping() {
        double shippingCost = 0;
        for (AtvPart atvPart : parts) {
            shippingCost += atvPart.calculateShipping();
        }

        return shippingCost;
    }
}

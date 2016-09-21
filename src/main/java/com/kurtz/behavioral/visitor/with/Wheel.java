package com.kurtz.behavioral.visitor.with;

public class Wheel implements AtvPart {
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}

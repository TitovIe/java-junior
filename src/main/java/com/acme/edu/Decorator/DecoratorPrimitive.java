package com.acme.edu.Decorator;

public class DecoratorPrimitive implements Decorator {
    @Override
    public String getDecorString(Object message) {
        return "primitive: " + message.toString();
    }
}

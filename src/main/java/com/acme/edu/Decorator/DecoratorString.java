package com.acme.edu.Decorator;

public class DecoratorString implements Decorator {
    @Override
    public String getDecorString(Object message) {
        return "string: " + message.toString();
    }
}

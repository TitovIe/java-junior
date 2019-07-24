package com.acme.edu.Decorator;

public class DecoratorChar implements Decorator {
    @Override
    public String getDecorString(Object message) {
        return "char: " + message.toString();
    }
}

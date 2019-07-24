package com.acme.edu.Decorator;

public class DecoratorArrayString implements Decorator {
    @Override
    public String getDecorString(Object message) {
        String messageDecor = String.join(System.lineSeparator(), (String[]) message);
        return ": " + messageDecor;
    }
}

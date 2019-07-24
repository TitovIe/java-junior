package com.acme.edu.Decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecoratorStringTest {

    @Test
    public void getDecorString() {
        String dummy = "test";
        DecoratorString ds = new DecoratorString();
        assertEquals("string: test", ds.getDecorString(dummy));
    }
}
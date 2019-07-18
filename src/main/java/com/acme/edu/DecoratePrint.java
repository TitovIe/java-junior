package com.acme.edu;

import javax.lang.model.type.PrimitiveType;

public class DecoratePrint {
    public void print(String type, String message) {
        System.out.println("string: " + message);
    }

    public void print(Character type, String message) {
        System.out.println("char: " + message);
    }

    public void print(Integer type, String message) {
        System.out.println("primitive: " + message);
    }

    public void print(Byte type, String message) {
        System.out.println("primitive: " + message);
    }

    public void print(Boolean type, String message) {
        System.out.println("primitive: " + message);
    }

    public void print(Object type, String message) {
        System.out.println("reference: " + message);
    }

    public void print(int[] type, String message) {
        String res = message
                .replace('[', '{')
                .replace(']', '}');
        System.out.println("primitives array: " + res);
    }

    public void print(String[] type, String message) {
        String res = String.join(System.lineSeparator(), message);
        System.out.println(": " + res);
    }
}

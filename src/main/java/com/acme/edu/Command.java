package com.acme.edu;

public class Command {
    private Object message;
    private boolean isDecorated;
    private Class<?> typeObject;
    private String typeObjectName;

    public Command(Object message, boolean isDecorated) {
        this.message = message;
        this.isDecorated = isDecorated;

        this.typeObjectName = this.message.getClass().toString();
        this.typeObject = message.getClass();
    }

    public Object getMessage() {
        return message;
    }

    public Class<?> getTypeObject() {
        return typeObject;
    }

    public String getTypeObjectName() {
        return typeObjectName;
    }
}

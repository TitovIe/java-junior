package com.acme.edu;

import com.acme.edu.Decorator.Decorator;

public class Command {
    private Decorator decorator;
    private Accamulator accamulator;
    private Object message;
    private String messageFormat;

    public Object getMessage() {
        return message;
    }

    public String getMessageFormat() {
        return messageFormat;
    }

    public Command(Decorator decorator, Object message) throws Exception {
        this.decorator = decorator;
        this.message = message;
        messageFormat = this.decorator.getDecorString(this.message);
    }

    public Command(Accamulator accamulator, Object message) {
        this.accamulator = accamulator;
        this.message = message;
        this.accamulator.saveData(this.message);
        messageFormat = accamulator.getMessageFormat();
        accamulator.setMessageFormat("");
    }

    @Override
    public String toString() {
        try {
            return messageFormat;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

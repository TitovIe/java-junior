package com.acme.edu;

import java.util.ArrayList;
import java.util.List;

public class Accamulator {
    private List<Object> buffer;
    private String messageFormat = "";

    public Accamulator() {
        buffer = new ArrayList<>();
    }

    public String getMessageFormat() {
        return messageFormat;
    }

    public void setMessageFormat(String messageFormat) {
        this.messageFormat = messageFormat;
    }

    public void saveData(Object message) {
        if (!(message instanceof String)) {
            buffer.add(message);
            return;
        } else {
            flush(false);
        }

        messageFormat += message.toString();
    }

    public void flush(boolean isEnd) {
        if (buffer.isEmpty()) {
            return;
        }

        int sumPrimitive = 0;
        for (Object value : buffer) {
            sumPrimitive = sumAndCheckLimit(sumPrimitive, value);
        }

        buffer.clear();
        messageFormat += String.valueOf(sumPrimitive);

        if(!isEnd)
         messageFormat += System.lineSeparator();
    }

    public void resetBuffer() {
        buffer.clear();
        messageFormat = "";
    }

    private int sumAndCheckLimit(int sumPrimitive, Object value) {
        if (value instanceof Integer) {
            int valueInt = (int) value;
            if ((valueInt >= 0 && Integer.MAX_VALUE - valueInt > sumPrimitive)
                    || (valueInt <= 0 && Byte.MAX_VALUE + valueInt < sumPrimitive)) {
                sumPrimitive += valueInt;
            } else {
                messageFormat += String.valueOf(sumPrimitive) + System.lineSeparator();
                sumPrimitive = valueInt;
            }
        } else {
            byte valueByte = (byte) value;
            if ((valueByte >= 0 && Byte.MAX_VALUE - valueByte > sumPrimitive)
                    || (valueByte <= 0 && Byte.MAX_VALUE + valueByte < sumPrimitive)) {
                sumPrimitive += valueByte;
            } else {
                messageFormat += String.valueOf(sumPrimitive) + System.lineSeparator();
                sumPrimitive = valueByte;
            }
        }
        return sumPrimitive;
    }
}

package com.acme.edu;

public class CheckerLimit {
    public int sumAndCheckLimit(int sumPrimitive, Object value) {
        if (value instanceof Integer) {
            int valueInt = (int) value;
            if ((valueInt >= 0 && Integer.MAX_VALUE - valueInt > sumPrimitive)
                    || (valueInt <= 0 && Byte.MAX_VALUE + valueInt < sumPrimitive)) {
                sumPrimitive += valueInt;
            } else {
                System.out.println(sumPrimitive);
                sumPrimitive = valueInt;
            }
        } else if(value instanceof Byte){
            byte valueByte = (byte) value;
            if ((valueByte >= 0 && Byte.MAX_VALUE - valueByte > sumPrimitive)
                    || (valueByte <= 0 && Byte.MAX_VALUE + valueByte < sumPrimitive)) {
                sumPrimitive += valueByte;
            } else {
                System.out.println(sumPrimitive);
                sumPrimitive = valueByte;
            }
        }
        return sumPrimitive;
    }
}

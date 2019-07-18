package com.acme.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AccamulatorPrint {
    private List<Object> buffer = new ArrayList<>();
    private CheckerLimit checkerLimit = new CheckerLimit();

    public void saveNotDecorated(Object message) {
        if (!(message instanceof String)) {
            buffer.add(message);
            return;
        } else {
            flush();
        }

        System.out.println(String.valueOf(message));
    }

    private void flush() {
        if (buffer.isEmpty()) {
            return;
        }

        int sumPrimitive = 0;
        for (Object value : buffer) {
            sumPrimitive = checkerLimit.sumAndCheckLimit(sumPrimitive, value);
        }

        buffer.clear();
        System.out.println(sumPrimitive);
    }
}

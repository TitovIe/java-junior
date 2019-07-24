package com.acme.edu;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AccamulatorTest {
    @Test
    public void shouldChangeMessageFormatWhenCallSaveData() {
        Accamulator accamulator = new Accamulator();
        accamulator.saveData(1);

        assertEquals(1, accamulator.getBuffer().size());
        assertEquals(1, accamulator.getBuffer().get(0));

        accamulator.saveData("test string");
        assertEquals("1" + System.lineSeparator() + "test string",
                accamulator.getMessageFormat());
    }

    @Test
    public void flush() {
        Accamulator accamulator = new Accamulator();
        accamulator.flush(true);
        assertEquals("", accamulator.getMessageFormat());

        accamulator.saveData(1);
        accamulator.saveData(4);

        String testString = "test string";
        accamulator.saveData(testString);
        accamulator.flush(false);
        assertEquals("5" + System.lineSeparator() + testString,
                accamulator.getMessageFormat());
    }
}
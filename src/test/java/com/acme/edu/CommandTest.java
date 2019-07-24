package com.acme.edu;

import com.acme.edu.Decorator.DecoratorString;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommandTest {
    @Test
    public void shouldChangeFormatWhenCallConstructor() throws Exception {
        String testString = "test string";

        Command command = new Command(new DecoratorString(), testString);
        assertEquals("string: test string", command.getMessageFormat());

        Accamulator accamulator = new Accamulator();
        accamulator.saveData(1);
        accamulator.saveData(2);
        command = new Command(accamulator, testString);
        assertEquals("3" + System.lineSeparator() + testString,
                command.getMessageFormat());
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenCommandnull() {
        Command command = new Command(new DecoratorString(), null);
    }
}
package com.acme.edu;

import com.acme.edu.Decorator.DecoratorPrimitive;
import com.acme.edu.Saver.LogSaverConsole;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

public class LoggerTest {
    @Test(expected = CommandException.class)
    public void log() throws Exception {
        Command command = mock(Command.class);
        LoggerController loggerController = new LoggerController(new LogSaverConsole(), command);
        //doThrow(new CommandException("Unknown command")).when(loggerController).getLogSaver().save(null);
        loggerController.getLogSaver().save(null);
    }
}
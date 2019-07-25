package com.acme.edu.Saver;

import com.acme.edu.LogReader;
import com.acme.edu.Logger;
import org.junit.Test;
import sun.rmi.runtime.Log;

import java.io.File;

import static org.junit.Assert.*;

public class LogSaverFileTest {
    @Test
    public void shouldLogInFileWhenCallLogSaverFile() throws Exception {
        Logger.isDecorated = false;
        Logger.log(2);
        Logger.log(3);
        Logger.log("test string");

        Logger.isDecorated = true;
        Logger.log(1);

        LogReader logReader = new LogReader(new File("target", "log.txt"));
        logReader.readFile();

        String lineSeparator = System.lineSeparator();
        assertEquals("5" + lineSeparator + "test string" +
                             lineSeparator + "primitive: 1" + lineSeparator,
                             logReader.getText());

    }
}
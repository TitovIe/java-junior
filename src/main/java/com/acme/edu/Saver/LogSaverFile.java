package com.acme.edu.Saver;

import com.acme.edu.Command;
import com.acme.edu.LogWriter;

import java.io.File;
import java.util.Objects;

public class LogSaverFile implements LogSaver {
    @Override
    public void save(Command command) throws Exception {
        LogWriter logWriter = new LogWriter(new File("target", "log.txt"));
        if (!(!(command.getMessage() instanceof String)
                && Objects.equals(command.getMessageFormat(), "")))
            logWriter.writeInFile(command.toString());
    }
}

package com.acme.edu.Saver;

import com.acme.edu.Command;

import java.util.Objects;

public class LogSaverConsole implements LogSaver {
    @Override
    public Object save(Command command) throws Exception {
        if(!(!(command.getMessage() instanceof String)
                && Objects.equals(command.getMessageFormat(), "")))
            System.out.println(command);

        return null;
    }
}

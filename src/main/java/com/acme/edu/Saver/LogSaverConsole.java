package com.acme.edu.Saver;

import com.acme.edu.Command;
import com.acme.edu.CommandException;

import java.util.Objects;

public class LogSaverConsole implements LogSaver {
    @Override
    public void save(Command command) throws CommandException {
        try {
            if (!(!(command.getMessage() instanceof String)
                    && Objects.equals(command.getMessageFormat(), "")))
                System.out.println(command);
        } catch (NullPointerException e) {
            System.out.println("Exception. Printing stack.");
            e.printStackTrace();
            throw new CommandException("Unknown exception", e);
        }
    }
}



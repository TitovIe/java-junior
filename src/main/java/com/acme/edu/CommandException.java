package com.acme.edu;

public class CommandException extends Exception {
    public CommandException(String unknown_command, Exception e) {
        super();
    }

    public CommandException(String unknown_command) {
        super();
    }
}

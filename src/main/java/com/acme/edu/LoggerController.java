package com.acme.edu;

public class LoggerController {
    private Command command;

    public LoggerController(Command command) {
        this.command = command;
    }

    public void printMessageDecorator() {
        DecoratePrint decoratePrint = new DecoratePrint();
        decoratePrint.print(command.getTypeObject(), command.getTypeObjectName());
    }

    public void printMessageAccamulator() {
        AccamulatorPrint accamulatorPrint = new AccamulatorPrint();
        accamulatorPrint.saveNotDecorated(command);
    }
}

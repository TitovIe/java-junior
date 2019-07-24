package com.acme.edu;

import com.acme.edu.Decorator.*;
import com.acme.edu.Saver.LogSaverConsole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Logger {
    private static Accamulator accamulator = new Accamulator();
    public static boolean isDecorated = true;

    public static void resetBuffer() {
        accamulator.resetBuffer();
        isDecorated = true;
    }

    public static void flush() {
        accamulator.flush(true);
        System.out.println(accamulator.getMessageFormat());
    }

    public static void log(int message) throws Exception {
        //saveLog(primitive, message);

        Command command;
        if (isDecorated)
            command = new Command(new DecoratorPrimitive(), message);
        else
            command = new Command(accamulator, message);

        LoggerController loggerController =
                new LoggerController(new LogSaverConsole(), command);

        loggerController.getLogSaver().save(command);
    }

    public static void log(byte message) throws Exception {
        //saveLog(primitive, message);

        Command command;
        if (isDecorated)
            command = new Command(new DecoratorPrimitive(), message);
        else
            command = new Command(accamulator, message);

        LoggerController loggerController =
                new LoggerController(new LogSaverConsole(), command);
        loggerController.getLogSaver().save(command);
    }

    public static void log(char message) throws Exception {
        //saveLog("char", message);

        Command command = new Command(new DecoratorChar(), message);
        LoggerController loggerController =
                new LoggerController(new LogSaverConsole(), command);
        loggerController.getLogSaver().save(command);
    }

    public static void log(String message) throws Exception {
        //saveLog("string", message);

        Command command;
        if (isDecorated)
            command = new Command(new DecoratorString(), message);
        else
            command = new Command(accamulator, message);

        LoggerController loggerController =
                new LoggerController(new LogSaverConsole(), command);
        loggerController.getLogSaver().save(command);
    }

    public static void log(boolean message) throws Exception {
        //saveLog(primitive, message);

        Command command = new Command(new DecoratorPrimitive(), message);
        LoggerController loggerController =
                new LoggerController(new LogSaverConsole(), command);
        loggerController.getLogSaver().save(command);
    }

    public static void log(Object message) throws Exception {
//        if (message == null) {
//            message = "null";
//        }
//        saveLog("reference", message);

        Command command = new Command(new DecoratorObject(), message);
        LoggerController loggerController =
                new LoggerController(new LogSaverConsole(), command);
        loggerController.getLogSaver().save(command);
    }

    public static void log(int... arrayInt) throws Exception {
        //saveLog("primitives array", arrayInt);

        Command command = new Command(new DecoratorArrayInt(), arrayInt);
        LoggerController loggerController =
                new LoggerController(new LogSaverConsole(), command);
        loggerController.getLogSaver().save(command);
    }

    public static void log(String... arrayString) throws Exception {
        //saveLog("", arrayString);

        Command command = new Command(new DecoratorArrayString(), arrayString);
        LoggerController loggerController =
                new LoggerController(new LogSaverConsole(), command);
        loggerController.getLogSaver().save(command);
    }
}

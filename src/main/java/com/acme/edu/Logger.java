package com.acme.edu;

public class Logger {
    private static void printConsole(String hint){
        System.out.println(hint);
    }

    private static String primitive = "primitive: ";

    public static void log(int message) {
        printConsole(primitive + message);
    }

    public static void log(byte message) {
        printConsole(primitive + message);
    }

    public static void log(char message) {
        printConsole("char: " + message);
    }

    public static void log(String message) {
        printConsole("string: " + message);
    }

    public static void log(boolean message) {
        printConsole(primitive + message);
    }

    public static void log(Object message) {
        printConsole("reference: " + message);
    }
}

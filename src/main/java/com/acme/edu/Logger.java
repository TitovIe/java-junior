package com.acme.edu;

import java.util.Objects;

public class Logger {
    private static String primitive = "primitive";
    private static int[] buffer;

    public static void flush(){
        if
    }

    private static void printConsole(String type, String message) {
        if (Objects.equals(type, primitive)) {
            sum =+ Integer.valueOf(message);
        }

        System.out.println(type + ": " + message);
    }

    public static void log(int message) {
        printConsole(primitive, String.valueOf(message));
    }

    public static void log(byte message) {
        printConsole(primitive, String.valueOf(message));
    }

    public static void log(char message) {
        printConsole("char" ,String.valueOf(message));
    }

    public static void log(String message) {
        printConsole("string", String.valueOf(message));
    }

    public static void log(boolean message) {
        printConsole(primitive, String.valueOf(message));
    }

    public static void log(Object message) {
        if (message == null) {
            message = "null";
        }
        printConsole("reference", String.valueOf(message));
    }


}

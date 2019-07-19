package com.acme.edu;

import com.acme.edu.Saver.LogSaver;

public class LoggerController {
    private LogSaver logSaver;

    public LoggerController(LogSaver logSaver, Command command) {
        this.logSaver = logSaver;
    }

    public LogSaver getLogSaver() {
        return logSaver;
    }
}

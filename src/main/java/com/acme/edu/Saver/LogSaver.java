package com.acme.edu.Saver;

import com.acme.edu.Command;

public interface LogSaver {
    void save(Command command) throws Exception;
}

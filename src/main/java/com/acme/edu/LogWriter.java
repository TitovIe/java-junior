package com.acme.edu;

import java.io.*;

public class LogWriter {
    private File path;

    public LogWriter(File path) {
        this.path = path;
    }

    public void writeInFile(String command) {
        try (
                final BufferedWriter bufferedWriter
                        = new BufferedWriter(
                                new OutputStreamWriter(
                                    new BufferedOutputStream(
                                        new FileOutputStream(path, true))))){
            bufferedWriter.write(command);
            bufferedWriter.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

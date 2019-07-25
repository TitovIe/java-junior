package com.acme.edu;

import java.io.*;

public class LogReader {
    private File path;
    private String text;

    public String getText() {
        return text;
    }

    public LogReader(File path) {
        this.path = path;
    }

    public void readFile() {
        try (
                final BufferedReader bufferedReader
                        = new BufferedReader(
                        new InputStreamReader(
                                new BufferedInputStream(
                                        new FileInputStream(path))))){
            String line;
            StringBuilder text = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line).append(System.lineSeparator());
            }
            this.text = text.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

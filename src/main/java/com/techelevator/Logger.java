package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Logger {

    public void write(String message){
        File logFile = new File("log.txt");
        PrintWriter writer = null;

        if (logFile.exists()){
            try {
                writer = new PrintWriter(new FileOutputStream(logFile, true));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }else {
            try {
                writer = new PrintWriter(logFile);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        writer.append(LocalDateTime.now() + " " + message + "\n");
        writer.flush();
        writer.close();
    }
}

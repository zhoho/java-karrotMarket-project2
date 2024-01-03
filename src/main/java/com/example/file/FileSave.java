package com.example.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileSave {
    public static void saveFile(String filename) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        printWriter.write("test");
        printWriter.close();
    }
}

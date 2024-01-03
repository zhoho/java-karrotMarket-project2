package com.example.file;

import java.nio.file.Paths;

public class FileSet {
    public static void setFileDir() {
        String path = Paths.get(".").toAbsolutePath().toString();
        String filename = path + "/data.txt";
        FileSave.saveFile(filename);
    }
}

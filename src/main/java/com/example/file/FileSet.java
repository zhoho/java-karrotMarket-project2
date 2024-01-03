package com.example.file;

import java.nio.file.Paths;

public class FileSet {
    public static String filename;
    public static String path;
    public static void setFileDir() {
        path = Paths.get("src/main/java/com/example/").toAbsolutePath().toString();
        filename = path + "/Item.json";
        FileLoad.loadItemsFromFile();
    }
}

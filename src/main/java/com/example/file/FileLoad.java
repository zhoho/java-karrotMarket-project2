package com.example.file;

import java.io.*;

public class FileLoad {
    public static void loadDate() {
        File file = new File("filePath");
        if(file.exists()) {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            System.out.println("파일 내용 출력");
            String line = null;
            while(true) {
                try {
                    if ((line = reader.readLine()) == null) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(line);
            }
            System.out.println("-----------------");
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterToy {

public static void writeToy(String toy) {

    String pathFile = "toyWin.txt";
    try {
        FileWriter writer = new FileWriter(pathFile, true);
        writer.write(toy + "\n");
        writer.close();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}
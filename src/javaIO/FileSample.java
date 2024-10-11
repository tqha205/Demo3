package javaIO;

import java.io.File;
import java.io.IOException;

public class FileSample {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/data/input.txt");
        file.createNewFile();

        File dir =new File("D:/data/tmp");
        dir.mkdir();
    }

}

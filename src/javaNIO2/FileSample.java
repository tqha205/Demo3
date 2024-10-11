package javaNIO2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSample {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("D:/data/student");
        Files.createDirectories(path);

        Path StudentFile =Paths.get("D:/data/student.txt");
        Files.createDirectories(StudentFile);
    }
}

package javaNIO2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PartSample {
    public static void main(String[] args) {
        Path path = Paths.get("D:/data");
        System.out.println(path.getFileName());
        System.out.println(path.toAbsolutePath());

        Path p1 = Paths.get("data");
        Path p2 = Paths.get("student");
        System.out.println(p1.relativize(p2));
    }
}

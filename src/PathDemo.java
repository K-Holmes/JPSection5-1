import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        Path[] paths = new Path[5];
        paths[0] = Paths.get("\\NIO2\\DemoFile.txt");
        paths[1] = Paths.get("/JavaProgramming/NIO2/DemoFile.txt");
        paths[2] = Paths.get("C:", "JavaProgramming", "NiO2", "DemoFile.txt");
        paths[3] = Paths.get("DemoFile.txt");
        paths[4] = Paths.get(URI.create("File:///~/DemoFile.txt"));

        for (int i = 0; i<paths.length;i++){
            System.out.println("Default File Path p["+i+"] -"+paths[i]);
        }

        System.out.println(paths[0].getFileName());
        System.out.println(paths[0].getParent());
        System.out.println(paths[0].getNameCount());
        System.out.println(paths[0].isAbsolute());
        System.out.println(paths[0].toAbsolutePath());
        System.out.println(paths[0].toUri());
    }
}

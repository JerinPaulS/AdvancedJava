package innerclasses;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo {

    public static void main(String[] args) {
        File dir = new File("src/main/java/innerclasses");
        for (String name:dir.list()) {
            System.out.println(name);
        }

        System.out.println("\nOnly Java files");
        for (String name:dir.list(new MyJavaFilter())) {
            System.out.println(name);
        }

        System.out.println("\nUsing anonymous inner classes");
        for (String name:dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File file, String name) {
                return name.endsWith(".txt");
            }
        })) {
            System.out.println(name);
        };
    }

}

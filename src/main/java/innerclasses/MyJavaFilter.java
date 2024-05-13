package innerclasses;

import java.io.File;
import java.io.FilenameFilter;

public class MyJavaFilter implements FilenameFilter {

    @Override
    public boolean accept(File file, String name) {
        return name.endsWith(".java");
    }

}

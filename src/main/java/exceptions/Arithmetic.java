package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arithmetic {

    public static void main(String[] args) {
        int x = 3;
        int y = 0;
        double z = 0;
        try {
            z = x /y;
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
        System.out.printf("x = %d, y = %d, z = %s%n", x, y, z);

        try {
            Arithmetic.class.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            System.out.println("This gets called in any case!");
        }

        Path dir = Paths.get("src", "main", "java", "exceptions");
//        BufferedReader br;
//        try {
//            br = Files.newBufferedReader(dir.resolve("Arithmetic.java"));
//            System.out.println(br.readLine());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }

        /** Try with closeable */
        /** Auto-closable interface */
        try (BufferedReader br = Files.newBufferedReader(dir.resolve("Arithmetic.java"))) {
            System.out.println(br.readLine());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            throw new MyException("This is my issue");
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }

    }
}

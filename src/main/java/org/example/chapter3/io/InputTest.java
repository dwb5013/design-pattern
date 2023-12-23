package org.example.chapter3.io;

import java.io.*;
import java.util.Objects;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try (
                InputStream in =
                        new LowerCaseInputStream(
                                new BufferedInputStream(
                                        Objects.requireNonNull(classLoader.getResourceAsStream("test.txt"))))) {
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        }
    }
}

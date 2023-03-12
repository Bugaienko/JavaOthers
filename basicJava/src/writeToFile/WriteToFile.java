package writeToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author Sergii Bugaienko
 */

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFile.txt");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Hello, World!");
        pw.println("Test row 2");

        pw.close();
    }
}

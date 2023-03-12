package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainExceptions {
    private static final String separator = File.separator;
    private static final String mainPath = separator + "JavaProjects" + separator + "JavaOther" + separator + "basicJava" + separator +
            "src" + separator + "exceptions" + separator;

    public static void main(String[] args) {
//        File file = new File(mainPath + "text.txt");

        try {
            readFile();
            System.out.println("После сканер");
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        }

        System.out.println("После блока try / catch");
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File(mainPath + "text2.txt");
        Scanner scanner = new Scanner(file);
    }
}

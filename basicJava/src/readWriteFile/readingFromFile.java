package readWriteFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Sergii Bugaienko
 */

public class readingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator+"JavaProjects" + separator +
                "JavaOther" + separator + "basicJava" + separator +
                "src" + separator +   "readWriteFile" + separator;

        File file = new File(path + "file.txt");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();

        File file1 = new File(path + "file.bin");
        Scanner scanner1 = new Scanner(file1);
        String line = scanner1.nextLine();
        String[] numbers = line.split(" ");
        int[] ints = new  int[3];
        int counter = 0;

        for (String number: numbers){
            ints[counter++] = Integer.parseInt(number);
        }




    }
}

package serializationP3;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Sergii Bugaienko
 */

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {
                new Person(1, "Bob"),
                new Person(2, "Mike"),
                new Person(3, "Tom")
        };

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("people.bin"))))
        {
            //Способ2
            oos.writeObject(people);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

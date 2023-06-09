package serializationP1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Sergii Bugaienko
 */

public class ReadObject {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("people.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();

            System.out.println(person1);
            System.out.println(person2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

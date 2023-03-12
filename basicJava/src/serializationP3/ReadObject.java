package serializationP3;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/**
 * @author Sergii Bugaienko
 */

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin")))
        {
            //Способ2
            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

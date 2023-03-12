package serializationP2;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

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

        try (FileOutputStream fos = new FileOutputStream("people.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
//            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //Способ 1
//            oos.writeInt(people.length); // число объектов массива
//            for (Person person: people) {
//                oos.writeObject(person);
//            }

            //Способ2
            oos.writeObject(people);


//            oos.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

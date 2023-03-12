package serializationP2;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/**
 * @author Sergii Bugaienko
 */

public class ReadObject {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("people.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)
        ) {

            //Способ1
//            int personCount = ois.readInt();
//            Person[] people = new Person[personCount];
//
//            for (int i = 0; i < personCount; i++) {
//                people[i] = (Person) ois.readObject();
//            }

            //Способ2
            Person[] people = (Person[]) ois.readObject();


            System.out.println(Arrays.toString(people));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

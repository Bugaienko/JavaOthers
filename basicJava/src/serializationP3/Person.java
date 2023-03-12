package serializationP3;

import java.io.Serializable;

/**
 * @author Sergii Bugaienko
 */

public class Person implements Serializable {

    private static final long serialVersionUID = -7108032653888282535L;
    private int id;
    private String personName; //не хотим хранить, записывать (серрилиозовывать)
    private int age;
    

    public Person(int id, String name) {
        this.id = id;
        this.personName = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return personName;
    }

    @Override
    public String toString() {
        return "{" + id + " : " + personName + "}";
    }
}

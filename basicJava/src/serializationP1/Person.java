package serializationP1;

import java.io.Serializable;

/**
 * @author Sergii Bugaienko
 */

public class Person implements Serializable {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" + id + " : " + name + "}";
    }
}

package collectionsTests.compareTo;

import java.util.*;

public class MainCompareTo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Set<Person> personSet = new TreeSet<>();

        addElements(personList);
        addElements(personSet);

//        Collections.sort(personList);

        System.out.println(personList);
        System.out.println(personSet);

    }

    private static void addElements(Collection collection){
        collection.add(new Person(3, "Katya"));
        collection.add(new Person(1, "Mark"));
        collection.add(new Person(4, "Georgy"));
        collection.add(new Person(2, "Bob"));

    }
}

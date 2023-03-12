package collectionsTests.hashcodeEqualsContract;

import java.util.*;

public class HashCodeEquals {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(1, "Mike");

        map.put(person1, "123");
        map.put(person2, "345");

        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);


    }

}


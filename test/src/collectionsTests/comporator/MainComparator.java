package collectionsTests.comporator;

import java.util.*;

public class MainComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("dog");
        list.add("cat");
        list.add("frog");
        list.add("a");
        list.add("bird");
        list.add("bb");
        list.add("fghytr");

        // With comparator
        Collections.sort(list, new StringLengthComparator());

        System.out.println(list);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 0, 500, 100, 24, 150));

//        Collections.sort(numbers, new NumbersBackwardComparator());
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(numbers);


        List<Person> persons = new ArrayList<>();
        persons.add(new Person(2, "Tim"));
        persons.add(new Person(4, "Mike"));
        persons.add(new Person(1, "Bob"));
        persons.add(new Person(3, "Katy"));

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getId() - p2.getId();
            }
        });

        System.out.println(persons);


    }


}

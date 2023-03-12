package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Goodbye");
        list.add("a");
        list.add("ab");

        //сортируем по длине строки
        Collections.sort(list, (str1, str2) -> str1.length() - str2.length());
        System.out.println(list);

        Comparator<String> comparator = (str1, str2) -> str2.length() - str1.length();
        Collections.sort(list, comparator);

        System.out.println(list);

    }
}

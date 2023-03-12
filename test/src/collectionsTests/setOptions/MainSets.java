package collectionsTests.setOptions;

import java.util.HashSet;
import java.util.Set;

public class MainSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        for (int i = 0; i < 6; i++) {
            set1.add(i);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int i = 2; i < 9; i++) {
            set2.add(i);
        }

        // union - объединение
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println(unionSet);

        //intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        //difference - разность множеств
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);

    }
}

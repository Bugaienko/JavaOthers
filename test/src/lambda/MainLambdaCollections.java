package lambda;

import java.util.*;
import java.util.stream.Collectors;

public class MainLambdaCollections {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        int[] arr1 = new int[10];

        fillArr(arr1);
        fillList(list1);


        // map method
        arr1 = Arrays.stream(arr1).map(a -> a * 2).toArray();
        list1 = list1.stream().map(a -> a * 2).collect(Collectors.toList());

        //каждому эл присвоить 3
        arr1 = Arrays.stream(arr1).map(a -> 3).toArray();
        arr1 = Arrays.stream(arr1).map(a -> a + 1).toArray();

        System.out.println(Arrays.toString(arr1));
        System.out.println(list1);

        //filter method

        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr(arr2);
        fillList(list2);

        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0 ).toArray();
        list2 = list2.stream().filter(a -> a % 2==0).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);

        //foreach
        Arrays.stream(arr2).forEach(a -> System.out.println(a));
        list2.stream().forEach(System.out::println);

        //reduce
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArr(arr3);
        fillList(list3);

        // если не указать начальное значение аккумулятора - ему присваивается первый эл в списке
        // и итерация начинается со 2-го элемента
        int sum = Arrays.stream(arr3).reduce(0, (acc, b) -> acc + b);
        int sum1 = list3.stream().reduce((acc, i) -> acc * i).get();

        System.out.println(sum);
        System.out.println(sum1);


        int[] arr4 = new int[10];
        fillArr(arr4);

        int[] arr5 = Arrays.stream(arr4).filter(a -> a % 2 != 0).map(b -> b * 3).toArray();
        System.out.println(Arrays.toString(arr5));


        //Любые коллекции
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(5);
        set.add(10);
        set.add(13);


        System.out.println(set);
        set = set.stream().map(a -> a / 2).collect(Collectors.toSet());
        System.out.println(set);

    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }
}

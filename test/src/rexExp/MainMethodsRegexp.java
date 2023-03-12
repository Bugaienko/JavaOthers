package rexExp;

import java.util.Arrays;

public class MainMethodsRegexp {
    public static void main(String[] args) {
        String a = "Hello there hey";
        String a1 = "Hello.there.hey";
        String a2 = "Stru21431241Hello2314141there1243124hey";
        String[] words = a.split(" "); // разделить строку по пробелам
        words = a1.split("\\."); // разделитель точка
        words = a2.split("\\d+");
        System.out.println(Arrays.toString(words));

        String b = "Hello there key";
        //replace - конкретную строку на строку
        //replaceAll - заменить по рег.выражению
        System.out.println(b.replaceAll("\\w{3}", "@@@"));
        System.out.println(b.replaceFirst ("\\w{3}", "@@@"));


    }
}

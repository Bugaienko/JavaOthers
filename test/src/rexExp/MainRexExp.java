package rexExp;

public class MainRexExp {
    public static void main(String[] args) {
        /*
        regexlib.com - сайт по регуляркам

        \\d - одна цифра
        \\w - одна буква
        \\w = [a-zA-Z]

        + - 1 или более
        * - 0 или более
        ? - 0 или 1 символов до
        ( | | ) - варианты совпадений ИЛИ так, ИЛИ так
        (x|y|z) - один из множества вариантов
        (-|\\+)? - может быть + или -. А может не быть)
        [abcd] = [a-d] = (a|b|c|d)
        [a-zA-Z] - описываем множества. Все английские буквы в данном случае
        [0-9] = \\d
        [^abc] - отрицание. Это множество НЕ должно присутствовать

        . - любой символ

        {2} - точное количество символов ДО - [a-z]{2} - две маленькие буквы
        {2, } - 2 или более символов
        {2, 4} - от 2 до 4 символов - "\\d{2,4}" - от 2 до 4 цифер

         */


        String str1 = "1234";
        System.out.println(str1.matches("1234"));
        System.out.println(str1.matches("1235"));

        String a = "-924654616";
        String b = "924654616";
        String c = "+213414";
        System.out.println(a.matches("(-|\\+)?\\d*")); //true
        System.out.println(b.matches("(-|\\+)?\\d*")); //true
        System.out.println(c.matches("(-|\\+)?\\d*")); //true

        String d = "u1234568";
        System.out.println(d.matches("[a-zA-Z]+\\d+"));

        String e = "hello";
        String e1 = "asdf";
        System.out.println(e.matches("[^abc]*")); //true
        System.out.println(e1.matches("[^abc]*")); //false

        String url = "http://www.google.com";
        String url1 = "http://www.spotify.ua";
        String url2 = "http://www. hello world";
        System.out.println(url.matches("http://www\\..+\\.(com|ua)"));
        System.out.println(url1.matches("http://www\\..+\\.(com|ua)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ua)"));





    }
}

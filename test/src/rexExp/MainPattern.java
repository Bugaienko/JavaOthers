package rexExp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainPattern {
    public static void main(String[] args) {
        String text = "Sie erhalten diese E-Mail unter sergiibugaienko@gmail.com, da Sie sich für unseren ECCO-Newsletter angemeldet haben. \n" +
                "\nWenn Sie keine E-Mails mehr von ECCO erhalten möchten, können Sie sich hier wieder" +
                " abmelden. Diese Nachricht wurde von ECCO Europe AG, Rothusstrasse 17, 6331 Hünenberg, solov@gmail.com Schweiz versandt. \n";

        Pattern emailReg = Pattern.compile("(\\w+@)(gmail|yandex)\\.(com|ua)");
        Matcher matcher = emailReg.matcher(text);

        List<String> list = new ArrayList<>();

        while (matcher.find()) {
            list.add(matcher.group());
            System.out.println(matcher.group());
            System.out.println(matcher.group(2));
        }

        System.out.println(list);
    }
}

package collectionsTests.comporator;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        /*
            s1 > s2 -> 1;
            s1 < s2 -> -1;
            s1 == s2 -> 0;
        */
        if (s1.length() > s2.length()) {
            return 1;
        } else if (s1.length() < s2.length()){
            return -1;
        }
        return 0;
    }
}

package datetime;

import java.util.SortedMap;

public class StringSample {

    public static void main(String[] args) {
        String s1 = " Ta Quang Ha";
        System.out.println(s1);
        String s2 = new String("Ta Quang Ha");
        System.out.println(s2);
        StringSample ss = new StringSample();
        System.out.println(ss.toString());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        String[] split = s1.split("Q");
        System.out.println(split.length);
        System.out.println(split[1]);

    }

    public String toString() {
        return "khong co dau";
    }
}

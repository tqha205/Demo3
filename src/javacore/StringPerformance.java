package javacore;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class StringPerformance {
    public static void main(String[] args) {
        LocalTime start = LocalTime.now();
        String link = "";
        for (int i = 0; i < 50000; i++) {
            link += i;
        }
        LocalTime finish = LocalTime.now();
        System.out.println("String Append :" + Duration.between(start, finish));
        start = LocalTime.now();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 500000; i++) {
            sb.append(i);
        }
        finish = LocalTime.now();
        System.out.println("String Builder :" + Duration.between(start, finish));
    }
}

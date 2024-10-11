package javacore;

public class UncheckedExceptionSample {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        if (b != 0) {
            System.out.println(a / b);
        }
//        Object obj = "Ta Quang Ha";
//        Integer number = (Integer) obj;

        UncheckedExceptionSample usn = new UncheckedExceptionSample();
        usn.test("srgtrhr");

    }

    public static void test(String name) {
        try {
            System.out.println(name.toUpperCase());
        } catch (NullPointerException e) {
            e.toString();

        }


    }
}

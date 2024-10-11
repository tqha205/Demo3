package codethu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WrapperClass {
    public static void main(String[] args) {
        int diem = 9;
        Integer DiemWrapper = Integer.valueOf(128);
        Character ch = Character.valueOf('t');

        System.out.println(DiemWrapper);
        System.out.println(ch);


        int diem2 = DiemWrapper;
        int ch2 = ch;

        Integer DiemWrapper2 = 128;
        if (DiemWrapper.equals(DiemWrapper2)) {
            System.out.println("gia tri bang nhau");

        }


//        khi nào thì nên dung Wrapper Class
//        1. java Colection
//        ArrayList<Integer> arr = new ArrayList<>();
//        Map<Integer, String> map = new HashMap();
//        2. Cần giá trị null
////        3.phương thức object
//        DiemWrapper2.equals(DiemWrapper2);
//        DiemWrapper2.compareTo(10);
//        DiemWrapper2.toString();
    }

}

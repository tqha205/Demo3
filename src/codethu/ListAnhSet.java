package codethu;

import java.util.*;

public class ListAnhSet {
    public static void main(String[] args) {
        List<String> tenList = new ArrayList<>();
        tenList.add("tien");
        tenList.add("tam");
        tenList.add("tai");
        tenList.add("tien");
//        System.out.println(tenList);
        Set<String> tenSet = new HashSet<>(tenList);
        System.out.println(tenSet);

//        Set<String> tenSet = new HashSet<>();
//        tenSet.add("tien");
//        tenSet.add("tam");
//        tenSet.add("tai");
//        tenSet.add("tien");
//        for (String ten: tenSet){
//            System.out.println(ten);
//        }


    }
}

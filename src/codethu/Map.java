package codethu;

import java.util.HashMap;

public class Map {

    public static void main(String[] args) {
//    tai =20000
//    tai nam =25000
//    ga =15000
        HashMap<String, Integer> banggia = new HashMap<>();
        banggia.put("tai", 20000);
        banggia.put("tai nam", 25000);
        banggia.put("ga", 15000);
        System.out.println(banggia);
        banggia.put("ga",13000);
        System.out.println(banggia);
        banggia.remove("ga");
        System.out.println(banggia);


    }
}

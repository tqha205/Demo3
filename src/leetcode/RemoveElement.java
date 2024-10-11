package leetcode;

import java.util.*;

public class RemoveElement {

    public static int RemoveElement(int[] numt, int val) {
        int index = 0;

        for (int i = 0; i < numt.length; i++) {
            if (numt[i] != val) {
                numt[index] = numt[i];
                index++;
            }

        }
        return index;


    }

    public static void main(String[] args) {
        int[] numt = {1, 2, 3, 4};
        int val = 0;
        RemoveElement(numt, val);


//        Set<Integer> set = new HashSet<>();

//        set.add(2);
//        set.add(3);
//        set.add(4);
//        set.add(5);
//        set.remove(2);
//        set.remove(3);
////        System.out.println(list);
////       map.remove();
//
//        System.out.println(set);
//        System.out.println(set.size());
    }


}

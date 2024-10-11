package javacore;

import netscape.security.UserTarget;

import java.sql.ClientInfoStatus;
import java.util.*;

public class ColectionSorting {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();


        list.add(2016);
        list.add(2019);
        list.add(2017);
        list.add(2018);
        for (Integer i : list) {
            System.out.println(i);
        }
        Collections.sort(list);
        System.out.println("---------");
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    }



package javacore;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        int[] ages = {22, 44, 64, 77, 99};
//        int index = 0;
//        while (ages[index ] <= 64) {
//            System.out.println(ages[index++]);
//            index ++;

        Scanner sc = new Scanner(System.in);
        int year = 2000;
        do {
            System.out.println("please input  a year  after :");
            year = sc.nextInt();
        } while (year <= 2000);
        System.out.println(" year value :" + year);


    }

}


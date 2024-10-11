package baitaplon;

import java.util.Scanner;

public class bai14_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập số nguyên từ 1 -99 :");
        int n = sc.nextInt();
        while (n < 1 || n > 99) {
            System.out.println("mời nhập lại n ,n chỉ từ 1-99.");
            n = sc.nextInt();


        }
        System.out.println("só vừa nhập là :" + n);


    }

}

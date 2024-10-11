package baitaplon;

import java.util.Scanner;

public class bai13ToanTu3Ngoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào một số nguyên dương :");
        int n = sc.nextInt();
//        toán tử 3 ngôi
        String traLoi = n % 2 == 0 ? "chăn" : "lẻ";
        System.out.println("sô " + n + " là số " + traLoi);

    }
}

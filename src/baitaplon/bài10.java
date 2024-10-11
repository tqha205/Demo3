package baitaplon;

import java.util.Scanner;

public class bài10 {
    public static void main(String[] args) {
        dienTichChuViHCN();
    }

    public static void dienTichChuViHCN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("chieu dai HCN :");
        float a = sc.nextInt();
        System.out.println("chieu dai HCN :" + a);

        System.out.println("chieu rong HCN :");
        float b = sc.nextInt();
        System.out.println("chieu rong HCN :" + b);
        float s = a * b;
        float p = (a + b) * 2;
        System.out.println("chu vi HCN la :" + s + " dien tich HCN La :" + p);
    }
}

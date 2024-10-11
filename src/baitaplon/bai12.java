package baitaplon;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        vietChuongTrinhB2();
    }

    public static void vietChuongTrinhB2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhâp số a :");
        double a = sc.nextDouble();
        System.out.println("mời bạn nhập số b :");
        double b = sc.nextDouble();
        System.out.println("mời bạn nhập số c :");
        double c = sc.nextDouble();
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta < 0) {
            System.out.println("phương trình vô nghiệm .");
        } else if (delta == 0) {
            double x = -b / 2 * a;
            System.out.println("phương trình có nghiệm kép x1 = x2 =" + x);
        } else {
            double x1 = (-b + Math.sqrt(2 * a));
            double x2 = (b + Math.sqrt(2 * a));
            System.out.println("phương trình có hai nghiệm phân biệt X1 ="+ x1 + ","+" X2 = " + x2);


        }


    }
}

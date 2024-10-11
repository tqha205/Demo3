package baitaplon;

import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
//        tinhGiaiThua();
//        nhapSuatTong();
//        tinhTongLe();
        timSoChiaHet();
    }

    public static void tinhGiaiThua() {
        long fack = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập số nguyên n :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
//            tính giai thừa
            fack = fack * i;
        }
        System.out.println("kết quả vừa nhâp chuyển sang giai thừa :" + n + "!" + "=" + fack);

    }

    public static void nhapSuatTong() {
        int tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập số nguyên a :");
        int a = sc.nextInt();
        if (a % 2 != 0) {
            System.out.println("tôi không tính tổng lẻ bye bye.");
        } else {
            for (int i = 0; i <= a; i += 2)
                tong += i;
            System.out.println("tong từ 0 đến a :" + tong);
        }

    }

    public static void tinhTongLe() {
        int tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhâp vào n :");
        int n = sc.nextInt();
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i += 2) {
                if (i == 3) {
//                    continue;
                    break;
                } else {
                    tong += i;
                }
            }
            System.out.println("tong so le :" + tong);
        }
    }

    public static void timSoChiaHet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhâp n :");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(" " + i);

            }
        }
    }
}


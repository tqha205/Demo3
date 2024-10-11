package edu;

import com.sun.corba.se.impl.legacy.connection.USLPort;

import java.util.Scanner;
import java.util.logging.SocketHandler;
import java.util.regex.Pattern;

//Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
//Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng này.
public class ThongTin {
    public static void main(String[] args) {
//        TrungBinh(arr);
        KiemTraMaSinhVien();
    }

//    public static void TrungBinh(int[] arr1) {
//        double tbcong = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("moi ban nhap so phan tu :");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("phan tu thu:" + (i + 1) + ":");
//            arr[i] = sc.nextInt();
//        }
//        String type = sc.nextLine();
//        System.out.println("ban co muon tinh gia tri trung binh khong .");
//        if (type.equals("yes")) {
//            for (int i = 0; i < arr.length; i++) {
//                tbcong += arr[i];
//
//            }
//            System.out.println("tb cong la :" + (float) tbcong / arr.length);
////        }if(type.equals("no")){
////            System.out.println("ket thuc chuong trinh.");
////        }

    public static void KiemTraMaSinhVien() {
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("^[0-9]$");
        System.out.println("moi nhap ma sinh vien :");
        String txt = sc.nextLine();
//        if (p.matches(txt).find()) {
//            System.out.println("phu hop");
//        } else {
//            System.out.println("khong phu hop.");
//        }
    }


}





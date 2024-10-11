package javacore;

import java.util.Map;
import java.util.Scanner;

public class GCEvalution {
    public static void main(String[] args) {
//        int[] arr = {2, 6, 8, 4, 9};
////
////        Max(arr);
        hienThiNgayGio(0);
    }

    public static void hienThiNgayGio(int time){
        Scanner sc =new Scanner(System.in);
        int ha = sc.nextInt();
        switch (ha){
            case 1:
                System.out.println("mot gio");
                break;
            case 2:
                System.out.println("hai gio");
                break;
            case 3:
                System.out.println("ba gio");
                break;
            case 4:
                System.out.println("bon gio");
                break;
            case 5:
                System.out.println("nam gio");
                break;
            default:
                System.out.println("moi ban nhap lai.");

        }
    }
//    public static void Max(int[] arr) {
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0 && arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("so chan lon nhat la :" + max);
//    }
}









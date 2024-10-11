package baitaplon;

import java.util.Scanner;

public class bai14_switchCase {
    public static void main(String[] args) {
        kienTraChanLe();
    }

    public static void kienTraChanLe() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. tìm theo tên.");
        System.out.println("2. tìm theo tác giả.");
        System.out.println("3. tìm theo tiêu nhà xuất bản.");
        System.out.println("4. tìm theo tiêu đè.");
        System.out.println("mời bạn chọn chương trình : ");
        int a = sc.nextInt();


        switch (a) {
            case 1:
                System.out.println("tìm theo tên.");
                break;
            case 2:
                System.out.println("tìm theo tác giả.");
                break;
            case 3:
                System.out.println("tìm theo nhà xuất bản.");
                break;
            case 4:
                System.out.println("tìm theo tiêu đề.");
                break;
            default:
                System.out.println("phím bấm không hợp lệ.");
                break;
        }


    }
}

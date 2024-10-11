package baitaplon;

import java.util.Scanner;

public class bai13_giaiBT {
    public static void main(String[] args) {
        GPA();
    }

    public static void GPA() {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập điểm tb : ");
        double gpa = sc.nextDouble();
        if (gpa > 10) {
            System.out.println("tào lao.");
            return;
        }
//        điều kiện của toán tử 3 ngôi
        String traLoi = (gpa >= 8 && gpa <= 10) ? "giỏi" :
                ((gpa < 8 && gpa >= 6.5) ? "khá" :
                        (gpa < 6.5 && gpa >= 5) ? "trung bình " : "yếu");
        System.out.println(traLoi);

    }
}

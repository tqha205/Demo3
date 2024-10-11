package baitaplon;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        kiemTraBMI();
    }

    public static void kiemTraBMI() {
//        nhap vao chieu cao va can nang
        Scanner sc = new Scanner(System.in);
        System.out.println("BMI của mít tơ nhung :");
        System.out.println("mời nhập vào chiều cao (m):");
        double chieuCao = sc.nextDouble();
        System.out.println("mời nhập vào cân nặng (kg):");
        double canNang = sc.nextDouble();
//        tính BMI
        double BMI = canNang / (Math.pow(chieuCao, 2));
// điều kiện
        if (BMI < 15) {
            System.out.println("thân hình quá gầy .");
        } else if (BMI >= 15 && BMI < 16) {
            System.out.println("thân hình gầy.");
        } else if (BMI >= 16 && BMI < 18.5) {
            System.out.println("thân hình hơi gầy.");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("thân hình bình thường.");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("thân hình hơi béo.");
        } else if (BMI >= 30 && BMI < 35) {
            System.out.println("thân hình béo.");
        } else if (BMI >= 35) {
            System.out.println("thân hình quá béo.");
        }else {
            System.out.println("thân hình béo.");

        }
    }
}

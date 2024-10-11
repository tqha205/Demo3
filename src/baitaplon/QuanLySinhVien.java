package baitaplon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {
    int maSo;
    String hoVaTen;
    double diemTrungBinh;
    String tenLop;

    SinhVien(int maSo, String hoVaTen, double diemTrungBinh, String tenLop) {
        this.maSo = maSo;
        this.hoVaTen = hoVaTen;
        this.diemTrungBinh = diemTrungBinh;
        this.tenLop = tenLop;
    }

    public String toString() {
        return "Mã số: " + maSo + ", Họ tên: " + hoVaTen +", ĐTB: " + diemTrungBinh + ", Lớp: " + tenLop;
    }
}

public class QuanLySinhVien {
    private static ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("Chọn công việc: ");
            System.out.println("1. Tạo danh sách sinh viên");
            System.out.println("2. Thêm sinh viên vào danh sách");
            System.out.println("3. Liệt kê danh sách sinh viên theo thứ tự giảm dần của ĐTB");
            System.out.println("4. Liệt kê sinh viên đoạt loại giỏi (ĐTB >= 8.0)");
            System.out.println("5. Liệt kê sinh viên theo lớp");
            System.out.println("6. Liệt kê sinh viên có ĐTB trong khoảng [a,b]");
            System.out.println("0. Thoát");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    taoDanhSachSinhVien();
                    break;
                case 2:
                    themSinhVien();
                    break;
                case 3:
                    lietKeDanhSachSinhVien();
                    break;
                case 4:
                    lietKeSinhVienGioi();
                    break;
                case 5:
                    lietKeSinhVienTheoLop();
                    break;
                case 6:
                    lietKeSinhVienTheoKhoangDiem();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void taoDanhSachSinhVien() {
        while (true) {
            System.out.print("Nhập mã số sinh viên (nhập số <= 0 để dừng): ");
            int maSo = scanner.nextInt();
            if (maSo <= 0) break;

            scanner.nextLine();
            System.out.print("Nhập họ và tên :");
            String hoVaTen = scanner.nextLine();
            System.out.print("Nhập điểm trung bình: ");
            double diemTrungBinh = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Nhập tên lớp: ");
            String tenLop = scanner.nextLine();
            SinhVien sv = new SinhVien(maSo, hoVaTen, diemTrungBinh, tenLop);
            danhSachSinhVien.add(sv);
        }
        for (SinhVien sv1 : danhSachSinhVien) {
            System.out.println(sv1);
        }


    }

    private static void themSinhVien() {
        System.out.print("Nhập vị trí cần thêm: ");
        int viTri = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập mã số sinh viên: ");
        int maSo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập họ và tên : ");
        String hoVaTen = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        double diemTrungBinh = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập tên lớp: ");
        String tenLop = scanner.nextLine();

        SinhVien sv = new SinhVien(maSo, hoVaTen, diemTrungBinh, tenLop);
        if (viTri >= 0 && viTri <= danhSachSinhVien.size()) {
            danhSachSinhVien.add(viTri, sv);
        } else {
            System.out.println("Vị trí không hợp lệ.Thêm vào cuối danh sách.");
            danhSachSinhVien.add(sv);
        }
        for (SinhVien sv1 : danhSachSinhVien) {
            System.out.println(sv1);
        }

    }

    private static void lietKeDanhSachSinhVien() {
        Collections.sort(danhSachSinhVien, new Comparator<SinhVien>() {
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv2.diemTrungBinh, sv1.diemTrungBinh);
            }
        });

        for (SinhVien sv : danhSachSinhVien) {
            System.out.println(sv);
        }
    }

    private static void lietKeSinhVienGioi() {
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.diemTrungBinh >= 8.0) {
                System.out.println(sv);
            }
        }
    }

    private static void lietKeSinhVienTheoLop() {
        System.out.print("Nhập tên lớp: ");
        String tenLop = scanner.nextLine();
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.tenLop.equals(tenLop)) {
                System.out.println(sv);
            }
        }
    }

    private static void lietKeSinhVienTheoKhoangDiem() {
        System.out.print("Nhập điểm a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập điểm b: ");
        double b = scanner.nextDouble();
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.diemTrungBinh >= a && sv.diemTrungBinh <= b) {
                System.out.println(sv);
            }
        }
    }
}

//Tạo danh sách sinh viên
//
//Chương trình yêu cầu nhập các thông tin của sinh viên bao gồm: mã số, họ đệm, tên, điểm trung bình, và tên lớp.
//Quá trình nhập sẽ dừng khi nhập mã số sinh viên nhỏ hơn hoặc bằng 0.
//Thêm sinh viên vào danh sách
//
//Chương trình cho phép nhập vị trí muốn thêm sinh viên mới.
//Nếu vị trí không hợp lệ, sinh viên mới sẽ được thêm vào cuối danh sách.
//Liệt kê danh sách sinh viên theo thứ tự giảm dần của điểm trung bình
//
//Danh sách sinh viên được sắp xếp theo điểm trung bình từ cao xuống thấp và hiển thị trên màn hình.
//Liệt kê sinh viên đoạt loại giỏi
//
//Chương trình sẽ hiển thị tất cả sinh viên có điểm trung bình lớn hơn hoặc bằng 8.0.
//Liệt kê sinh viên theo lớp
//
//Nhập vào tên lớp, chương trình sẽ hiển thị danh sách sinh viên thuộc lớp đó.
//Liệt kê sinh viên có điểm trung bình trong khoảng [a,b]
//
//Nhập vào hai giá trị điểm a và b, chương trình sẽ hiển thị các sinh viên có điểm trung bình nằm trong khoảng từ a đến b.
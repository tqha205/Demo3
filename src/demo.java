import java.util.Calendar;
import java.util.Scanner;

public class demo {
    //    public static void main(String[] args) {
//        int day, month, year, tuoi;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("moi ban nhap ngay sinh ");
//        day = sc.nextInt();
//        System.out.println("moi ban nhap thang sinh");
//        month = sc.nextInt();
//        System.out.println("moi ban nhap nam sinh ");
//        year = sc.nextInt();
//        Calendar bithday = Calendar.getInstance();
//        bithday.set(year, month - 1, day);
//        int namSinh = bithday.get(Calendar.YEAR);
//        int thangSinh = bithday.get(Calendar.MONTH);
//        int ngaySinh = bithday.get(Calendar.DAY_OF_MONTH);
//        System.out.println("nagy thang nam sinh cua ban la :" + ngaySinh + "/ " + (thangSinh + 1) + " /" +namSinh);
//        Calendar now = Calendar.getInstance();
//        int namHienTai = now.get(Calendar.YEAR);
//        tuoi = namHienTai - namSinh;
//        System.out.println("tuoi cua ban la :" + tuoi);
//
//    }
    static boolean isloop = true;

    public static void main(String[] args) {

        tinhTong();
    }

    public static void tinhTong() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" moi ban nhap a : ");
        int a = sc.nextInt();
        System.out.println("moi ban nhap b :");
        int b = sc.nextInt();
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("day la so chan .");
        } else {
            System.out.println("day la so le .");
        }
        System.out.println("ban co muon tinh tong khong :");
        System.out.println("0.No| 1.Yes");
        int option = sc.nextInt();
        int sum = a + b;
        System.out.println("tong hai so la : " + sum );
        if (option != 0 && option != 1) {
            System.out.println("ban da nhap sai .moi nhap lai ");
            option = sc.nextInt();
        }
        isloop = option == 1;
    }

}

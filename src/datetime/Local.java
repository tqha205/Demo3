package datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Local {
    public static void main(String[] args) {
        int day, month, year, tuoi;
        String name;
        //    nhap du lieu tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap ten :");
        name = sc.nextLine();
        System.out.println("moi ban nhap ngay sinh :");
        day = sc.nextInt();
        System.out.println("moi ban nhap thang sinh :");
        month = sc.nextInt();
        System.out.println("moi ban nhap nam sinh :");
        year = sc.nextInt();
//        Calendar cal = Calendar.getInstance();
//        System.out.println(cal);
        Calendar bithday = Calendar.getInstance();
        bithday.set(year, month - 1, day);
        int namSinh = bithday.get(Calendar.YEAR);
        int thangSinh = bithday.get(Calendar.MONTH);
        int ngaySinh = bithday.get(Calendar.DAY_OF_MONTH);
        System.out.println("ngay thang nam sinh " + ngaySinh + " " + (thangSinh + 1) + " " + namSinh);
        Calendar now = Calendar.getInstance();
        int namHienTai = now.get(Calendar.YEAR);
        tuoi = namHienTai - namSinh;
        System.out.println("tuoi cau bn la :" + tuoi);

//        LocalDate ld = LocalDate.now();
//        System.out.println(ld);
//        LocalTime lt = LocalTime.now();
//        System.out.println(lt);
//        LocalDateTime ldt = LocalDateTime.now();
//        System.out.println(ldt);
//
//        DateTimeFormatter dtl = DateTimeFormatter.ofPattern("dd-MM-yyy");
//        System.out.println(ld.format(dtl));
//        String strDate = "21-05-2018";
//        System.out.println(LocalDate.parse(strDate, dtl));
//
//        Period period = Period.ofDays(5);
//        System.out.println(ld.minus(period));
//
//        Duration duration = Duration.ofHours(5);
//        System.out.println(lt.minus(duration));
//        ldt.plus(duration);
//
//        ZoneId zooe = ZoneId.of("Asia/Singapore");
//        ZonedDateTime zdt = ZonedDateTime.of(ldt, zooe);
//        System.out.println(zdt);

    }
}

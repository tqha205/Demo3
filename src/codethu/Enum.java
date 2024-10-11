package codethu;

enum PizzaStatus {
    DAT_HANG(5),
    CHUAN_BI(10),
    GIAO_HANG(15);
     final int thoiGian;

    PizzaStatus(int thoiGian) {
        this.thoiGian = thoiGian;
    }
}

public class Enum {
    public static void main(String[] args) {


        PizzaStatus status = PizzaStatus.DAT_HANG;
        if (status == PizzaStatus.DAT_HANG) {
            System.out.println("hang da duoc dat.");
        }

        for (PizzaStatus s : PizzaStatus.values()) {
            System.out.println(s);
        }

        System.out.println(PizzaStatus.GIAO_HANG.thoiGian);
    }


}

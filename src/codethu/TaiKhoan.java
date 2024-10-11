package codethu;

public class TaiKhoan {
    private double soDu;

    public TaiKhoan() {
    }

    public TaiKhoan(double soDu) {
        this.soDu = soDu;
    }


    public void rutTien(double soTien) throws Exception {
        if (soTien > soDu) {
            throw new Exception("so du cua ban khong du de rut");
        }
        soDu = soDu - soTien;
    }

    public double getSoDu() {
        return soDu;
    }

    public static void main(String[] args)  {

        TaiKhoan taiKhoan = new TaiKhoan(1000);
        try {
            taiKhoan.rutTien(500);
            System.out.println("rut tien thanh cong");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println();
        }

        System.out.println(taiKhoan.getSoDu());
    }
}

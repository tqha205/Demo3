package codethu;

public class TaiKhoanNganHang {
    private double soDu;

// tính đóng gói
    public void napTien(double soTien) {
        if(soTien<=0){
            System.out.println("ban can nap nhieu hon.");
        }
        soDu = soDu + soTien;
    }

    public void rutTien(double soTien) {
        soDu = soDu - soTien;
        if(soTien>soDu){
            System.out.println("Tài khoản có đủ tiền dell đâu mà rút nhiều vậy.");
        }
    }

    public double getSoDu() {
        return soDu;
    }
}

package codethu;
// lop long nhau trong java
public class Innerclass {
    public static void main(String[] args) {
        BenNgoai benNgoai = new BenNgoai();
        BenNgoai.BenTrong benTrong = new BenNgoai.BenTrong();
        System.out.println(benTrong.chaoTuBenTrong);
        benTrong.phuongThucBenTrong();
    }
}

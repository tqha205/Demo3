package codethu;

public class Static {
    public static int dem = 0;
    public int chieuDai;

    public void HinhVuong(int chieuDai) {
        this.chieuDai = chieuDai;
        dem += 1;
    }


    public static void main(String[] args) {
        GiaoVien giaoVien = new GiaoVien();
        giaoVien.Hoa();
        giaoVien.Toan();
        giaoVien.Van();
    }
}

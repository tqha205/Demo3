package codethu;

class Hinh {
    public void ve() {
        System.out.println("dang ve hinh.");
    }


}

class HinhVuong extends Hinh {
    @Override
    public void ve() {
        System.out.println("dang ve hinh vuong.");
    }
}

class HinhTron extends Hinh{
    @Override
    public void ve() {
        System.out.println("dang ve hinh tron.");
    }
}

public class LopVoDanh {
    public static void main(String[] args) {
        Hinh hinh = new Hinh();
        hinh.ve();

        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.ve();
        HinhTron hinhTron = new HinhTron();
        hinhTron.ve();
    }
}

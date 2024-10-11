package codethu;

class NhanVat {
    public  void tanCong() {
        System.out.println("tan cong bang tay.");

    }
}

// khi extends thì lớp con sẽ được thừa hưởng các thuộc tính của lớp cha
    class CaiBang extends NhanVat {
//    ghi đè phương thức
@Override
        public  void tanCong (){
    System.out.println("tan cong bang gay .");
}
    }


public class Overriding {
    public static void main(String[] args) {
        NhanVat nhanVat = new NhanVat();
        nhanVat.tanCong();
        CaiBang caiBang =new CaiBang();
        caiBang.tanCong();
    }
}

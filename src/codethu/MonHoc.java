package codethu;

//thuc hanh
class MonHoc {
    public void Toan() {
        System.out.println("123");
    }

    public void Van() {
        System.out.println("truyen kieu");

    }

    public void Hoa() {
        System.out.println("CH4");
    }

}

class GiaoVien extends MonHoc {
    @Override
    public void Toan(){
        System.out.println("log a");
    }
}


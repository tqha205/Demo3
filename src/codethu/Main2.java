package codethu;

public class Main2 {
    public static void main(String[] args) {

        Cat1 cat1 = new Cat1();
        cat1.speak();

//      biểu thức lambda
        Animal1 meo2 = () ->  System.out.println("meo meo");
//      nếu phương thức chỉ triển khai trên một dòng thì không cần dấu ngoặc nhọn
//      nếu nhiều hơn một dòng bắt buộc phải sử dụng ngoặc nhọn


        meo2.speak();
    }
}


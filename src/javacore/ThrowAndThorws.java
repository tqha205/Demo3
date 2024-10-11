package javacore;

public class ThrowAndThorws {
    public static void main(String[] args) throws Exception {
        ThrowAndThorws tat = new ThrowAndThorws();

//  co hai cach la có thể sử dụng throw Exception trên hàm main
//    hoặc có thể sử dụng try catch.
        try {
            tat.checkStatus();
            tat.connecDataBase();
        } catch (EducationException e) {
            e.toString();
        } catch (Exception e) {
            e.toString();

        }
    }

    public void connecDataBase() throws Exception {


        throw new NullPointerException();

    }

    public void checkStatus() throws EducationException {
        throw new EducationException("out of slost");
    }
}

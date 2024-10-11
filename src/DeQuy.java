public class DeQuy {
    public static int GiaiThua(int n) {

//      bài toan co so
        if (n == 0) {
            return 1;
        }
//        cong thuc quy nap
        int t = n * GiaiThua(n - 1);
        return t;
    }


    //    tim so Fibo thu n
//    public static int fiBo(int n) {
////        bai toan co so
//        System.out.println("tinh :F[" + n + "]");
//        if (n <= 2)
//
//
//            return 1;
////        cong thua quy nap
//        int fn = fiBo(n - 1) + fiBo(n - 2);
//
//        return fn;
//    }

    //    in cac phan tu trong mang bang phuong phap de quy
    public static void printElement(int[] arr, int index) {
//        bai toan co so
        if (index < 0 || index >= arr.length)
            return;
//        cong thuc quy nap : in phan tu index ,print index +1

        printElement(arr, index + 1);
        System.out.println(arr[index]);
    }

    static int[] F = new int[1000];

    public static int fiBo2(int n) {
//        bai toan co so
        if (F[n] != 0)
            return F[n];
        System.out.println("can tinh F[" + n + "] ");
        if (n <= 2) {
            F[1] = 1;
            F[2] = 1;
            return 1;
        }
        F[n] = fiBo2(n - 1) + fiBo2(n - 2);
        return F[n];

//        cong thua quy nap

    }

    public static void main(String[] args) {
//        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        printElement(arr, 0);
//        System.out.println(fiBo2(10));

//F[10]
        int Fibo[] = new int[11];
//bai toan co so
        Fibo[1] = 1;
        Fibo[2] = 1;
        for (int i = 3; i <= 10; i++) {
            Fibo[i] = Fibo[i - 1] + Fibo[i - 2];
        }
        System.out.println(Fibo[10]);
//        System.out.println(GiaiThua(3));
//        System.out.println(fiBo(5));
//        System.out.println(fiBo(9));
    }
}

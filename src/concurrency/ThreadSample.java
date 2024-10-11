package concurrency;

public class ThreadSample {
    public static void main(String[] args) {
        customeThead customeThead = new customeThead();
        customeThead.start();
    }


}

class customeThead extends Thread {
    @Override
    public void run() {
        int count = 0;
        while (count++ < 5) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("dang chay");
        }

    }

}



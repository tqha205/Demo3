package concurrency;

import java.util.concurrent.TimeUnit;

public class Woker implements Runnable {
    private String name;

    public Woker(String string) {
        super();
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int count = 0;
        while (count++ < 5) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
            System.out.println(this.getName());
        }

    }
}

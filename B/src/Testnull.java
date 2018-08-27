import java.util.ArrayList;
import java.util.List;

public class Testnull {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int x=0;x<100;x++){
                    System.out.println(Thread.currentThread().getName() + ":" + x);
                }
            }
        }).start();

    }

}

class a implements Runnable{

    @Override
    public void run() {

    }

}




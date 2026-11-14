package praktikum6;

public class ClassPewaristhread {
    public static void main(String[] args) {
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread sedang berjalan: " + Thread.currentThread().getName());
    }
}
        MyThread t1 = new MyThread();
        t1.start();
    }
}

    


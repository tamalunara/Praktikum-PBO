package Praktikum6;

public class ExTred extends Thread {

    @Override
    public void run() {
        System.out.println("Thread sedang berjalan.");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Proses thread ke-" + i);
        }

        System.out.println("Thread selesai.");
    }

    public void jalankan() {
        System.out.println("=== 7: Inheritance Thread ===");

        ExTred thread = new ExTred();

        thread.start();
    }
}
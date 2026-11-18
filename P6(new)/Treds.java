package Praktikum6;

import java.util.Scanner;

public class Treds{

    class ChThread extends Thread {

        public ChThread(String nama) {
            super(nama);
        }

        public void run() {
            System.out.println("Thread berjalan: " + getName());
        }
    }

    public void jalankan(Scanner input) {
        System.out.println("=== 8:Banyak Thread ===");

        System.out.print("Masukkan Jumlah Thread: ");
        int jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            ChThread thread = new ChThread("Thread-" + i);
            thread.start();
        }
    }
}
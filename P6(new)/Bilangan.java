package Praktikum6;

import java.util.Scanner;

public class Bilangan {

    public void jalankan(Scanner input) {
        System.out.println("=== 6: Rata-rata Bilangan ===");

        int n;

        try {
            System.out.print("Masukkan jumlah bilangan: ");
            n = input.nextInt();

        } catch (Exception e) {
            System.out.println("Input harus berupa angka.");
            input.nextLine();
            return;
        }

        double[] ang = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            boolean valid = false;

            while (!valid) {
                try {
                    System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                    ang[i] = input.nextDouble();

                    total += ang[i];
                    valid = true;

                } catch (Exception e) {
                    System.out.println("Input salah! Coba Masukkan Angka Lagi..");
                    input.nextLine();
                }
            }
        }

        double rataRata = total / n;

        System.out.println("Jumlah seluruh bilangan: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}
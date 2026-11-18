package Praktikum6;

import java.util.Scanner;

public class Mahasiswa {

    public void jalankan(Scanner input) {
        System.out.println("=== 4: Daftar Nilai Mahasiswa ===");

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();
        input.nextLine();

        if (n <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
            return;
        }

        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));

            System.out.print("Nama: ");
            nama[i] = input.nextLine();

            System.out.print("Nilai: ");
            nilai[i] = input.nextInt();
            input.nextLine();

            if (nilai[i] > 50) {
                status[i] = "Lulus";
            } else {
                status[i] = "Tidak Lulus";
            }
        }

        System.out.println("====== DAFTAR NILAI MAHASISWA ======");
        System.out.printf("%-5s %-20s %-10s %-15s%n",
                "No", "Nama", "Nilai", "Status");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d %-20s %-10d %-15s%n",
                    i + 1, nama[i], nilai[i], status[i]);
        }
    }
}
package Praktikum6;

import java.util.Scanner;

public class OperasiArr {

    public void jalankan(Scanner input) {
        System.out.println("=== 3: Operasi Array ===");

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah elemen harus lebih dari 0.");
            return;
        }

        int[] ang = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + i + ": ");
            ang[i] = input.nextInt();
        }

        int bsr = ang[0];
        int kcl = ang[0];
        int iMax = 0;
        int iMin = 0;
        int total = 0;
        int jmlGanjil = 0;
        int jmlGenap = 0;

        for (int i = 0; i < n; i++) {
            total += ang[i];

            if (ang[i] > bsr) {
                bsr = ang[i];
                iMax = i;
            }

            if (ang[i] < kcl) {
                kcl = ang[i];
                iMin = i;
            }

            if (i % 2 == 0) {
                jmlGenap += ang[i];
            } else {
                jmlGanjil += ang[i];
            }
        }

        double rataRata = (double) total / n;

        System.out.println("\nNilai terbesar: " + bsr);
        System.out.println("Indeks terbesar: " + iMax);

        System.out.println("Nilai terkecil: " + kcl);
        System.out.println("Indeks terkecil: " + iMin);

        System.out.println("Jumlah seluruh elemen: " + total);
        System.out.println("Rata-rata: " + rataRata);

        System.out.println("Jumlah indeks genap: " + jmlGenap);
        System.out.println("Jumlah indeks ganjil: " + jmlGanjil);

        if (jmlGenap % 2 == 0) {
            System.out.println("Hasil penjumlahan indeks genap: GENAP");
        } else {
            System.out.println("Hasil penjumlahan indeks genap: GANJIL");
        }

        if (jmlGanjil % 2 == 0) {
            System.out.println("Hasil penjumlahan indeks ganjil: GENAP");
        } else {
            System.out.println("Hasil penjumlahan indeks ganjil: GANJIL");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (ang[j] > ang[j + 1]) {
                    int ang2 = ang[j];
                    ang[j] = ang[j + 1];
                    ang[j + 1] = ang2;
                }
            }
        }

        System.out.println("Array setelah diurutkan:");

        for (int nilai : ang) {
            System.out.print(nilai + " ");
        }

        System.out.println();
    }
}
package Praktikum6;

import java.util.Scanner;

public class Matrix {

    public void jalankan(Scanner input) {
        System.out.println("=== 5: Penjumlahan Matrix ===");

        System.out.print("Masukkan jumlah baris: ");
        int bar = input.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kol = input.nextInt();


        int[][] A = new int[bar][kol];
        int[][] B = new int[bar][kol];
        int[][] C = new int[bar][kol];

        System.out.println("Masukkan elemen matrix A:");

        for (int i = 0; i < bar; i++) {
            for (int j = 0; j < kol; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("Masukkan elemen matrix B:");

        for (int i = 0; i < bar; i++) {
            for (int j = 0; j < kol; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < bar; i++) {
            for (int j = 0; j < kol; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Hasil Penjumlahan:");

        for (int i = 0; i < bar; i++) {
            for (int j = 0; j < kol; j++) {
                System.out.print(C[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
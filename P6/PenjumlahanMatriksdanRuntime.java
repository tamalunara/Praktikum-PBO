package praktikum6;

import java.util.Scanner;

public class PenjumlahanMatriksdanRuntime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();
        
        int[][] A = new int[baris][kolom];
        int[][] B = new int[baris][kolom];
        int[][] Hasil = new int[baris][kolom];
        
        System.out.println("\n--- Input Matriks A ---");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Matriks A [" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\n--- Input Matriks B ---");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Matriks B [" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }
        
        // Penjumlahan Matriks
        System.out.println("\n--- Hasil Penjumlahan Matriks ---");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                Hasil[i][j] = A[i][j] + B[i][j];
                System.out.print(Hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

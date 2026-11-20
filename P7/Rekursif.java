package Praktikum7;

import java.util.Scanner;

public class Rekursif {
    
    public long faktorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * faktorial(n - 1);
    }

    public void jalankan(Scanner input) {
        System.out.println("=== 5: Program Method Rekursif (Faktorial) ===");
        System.out.print("Masukkan bilangan bulat positif: ");
        int angka = input.nextInt();

        if (angka < 0) {
            System.out.println("Angka tidak boleh negatif.");
        } else {
            System.out.println("Hasil " + angka + "! = " + faktorial(angka));
        }
    }
}
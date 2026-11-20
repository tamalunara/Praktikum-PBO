package Praktikum7;

import java.util.Scanner;

public class PersegiPanjang {
    
    public double hitungKeliling(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    public void jalankan(Scanner input) {
        System.out.println("=== 2: Keliling Persegi Panjang ===");
        System.out.print("Masukkan panjang : ");
        double p = input.nextDouble();
        System.out.print("Masukkan lebar   : ");
        double l = input.nextDouble();

        double keliling = hitungKeliling(p, l);
        System.out.println("Keliling Persegi Panjang = " + keliling);
    }
}
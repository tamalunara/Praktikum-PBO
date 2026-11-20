package Praktikum7;

import java.util.Scanner;

public class Tebak {
    
    public int tebakTanggal(int bulan, int tanggal) {
        
        int hasil = (((bulan * 2) + 5) * 50) + tanggal - 250;
        return hasil;
    }

    public void jalankan(Scanner input) {
        System.out.println("=== 3: Tebak Bulan dan Tanggal Lahir ===");
        System.out.print("Masukkan angka bulan lahir (1-12)   : ");
        int bulan = input.nextInt();
        System.out.print("Masukkan tanggal lahir (1-31)       : ");
        int tanggal = input.nextInt();

        int hasilAkhir = tebakTanggal(bulan, tanggal);
        System.out.println("Hasil akhir tebakan = " + hasilAkhir);
    }
}
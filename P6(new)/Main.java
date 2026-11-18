package Praktikum6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean cek = true;

        Array arr = new Array();
        Mobil mbl = new Mobil();
        OperasiArr operasi = new OperasiArr();
        Mahasiswa mhs = new Mahasiswa();
        Matrix mtr = new Matrix();
        Bilangan bil = new Bilangan();
        ExTred tred = new ExTred();
        Treds trds = new Treds();
        Perulangan loop = new Perulangan();
        ArrList arrl = new ArrList();

        do {
            System.out.println("==============================================");
            System.out.println("  ARRAY, EXCEPTION HANDLING DAN MULTITHREADING");
            System.out.println("==============================================");
            System.out.println("1. Tiga Array");
            System.out.println("2. Mengubah Nilai Array");
            System.out.println("3. Operasi Array");
            System.out.println("4. Daftar Nilai Mahasiswa");
            System.out.println("5. Penjumlahan Matrix");
            System.out.println("6. Rata-rata Bilangan");
            System.out.println("7. Inheritance Thread");
            System.out.println("8. Banyak Thread");
            System.out.println("9. Perulangan Array");
            System.out.println("10. Array List");
            System.out.println("0. Keluar");
            System.out.println("----------------------------------------------");
            System.out.print("Pilih (1-10): ");

            int pil = s.nextInt();

            System.out.println();

            switch (pil) {
                case 1 -> arr.jalankan(s);
                case 2 -> mbl.jalankan();
                case 3 -> operasi.jalankan(s);
                case 4 -> mhs.jalankan(s);
                case 5 -> mtr.jalankan(s);
                case 6 -> bil.jalankan(s);
                case 7 -> tred.jalankan();
                case 8 -> trds.jalankan(s);
                case 9 -> loop.jalankan();
                case 10 -> arrl.jalankan();
                case 0 -> cek = false;
                default -> System.out.println("Pilihan tidak valid.");
            }

            System.out.println();

        } while (cek);

        System.out.println("Program selesai.");
        s.close();
    }
}
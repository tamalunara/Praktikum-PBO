package Praktikum7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean cek = true;

        MekanismeObjek soal1 = new MekanismeObjek();
        PersegiPanjang soal2 = new PersegiPanjang();
        Tebak soal3 = new Tebak();
        SumpahPemuda soal4 = new SumpahPemuda();
        Rekursif soal5 = new Rekursif();
        Civitas soal6 = new Civitas();
        Mahasiswa soal7 = new Mahasiswa();

        do {
            System.out.println("==============================================");
            System.out.println("      LATIHAN PRAKTIKUM KELAS DAN OBJEK       ");
            System.out.println("==============================================");
            System.out.println("1. Mekanisme Kelas Menjadi Objek");
            System.out.println("2. Keliling Persegi Panjang");
            System.out.println("3. Bulan dan Tanggal Lahir");
            System.out.println("4. Teks Sumpah ");
            System.out.println("5. Method Rekursif");
            System.out.println("6. Civitas Akademika Fakultas Teknik");
            System.out.println("7. Input Data Mahasiswa");
            System.out.println("0. Keluar");
            System.out.println("----------------------------------------------");
            System.out.print("Pilih (1-7): ");

            int pil = s.nextInt();
            s.nextLine();
            System.out.println();

            switch (pil) {
                case 1 -> soal1.jalankan();
                case 2 -> soal2.jalankan(s);
                case 3 -> soal3.jalankan(s);
                case 4 -> soal4.jalankan();
                case 5 -> soal5.jalankan(s);
                case 6 -> soal6.jalankan();
                case 7 -> soal7.jalankan(s);
                case 0 -> cek = false;
                default -> System.out.println("Pilihan tidak valid.");
            }

            System.out.println();

        } while (cek);

        System.out.println("Program selesai.");
        s.close();
    }
}
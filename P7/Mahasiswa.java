package Praktikum7;

import java.util.Scanner;

public class Mahasiswa {
    String nama;
    String npm;
    String kelas;

    public void set(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println("\n--- Data Mahasiswa ---");
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }

    public void jalankan(Scanner input) {
        System.out.println("=== 7: Input & Tampil Data Mahasiswa (this) ===");

        System.out.print("Masukkan Nama  : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NPM   : ");
        String npm = input.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = input.nextLine();

        set(nama, npm, kelas);
        tampilkanData();
    }
}
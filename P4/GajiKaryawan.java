package Praktikum4;

import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan NIK: ");
        String nik = sc.nextLine();
        
        System.out.print("Masukkan Nama: ");
        String nm = sc.nextLine();
        
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int kg = sc.nextInt();
        
        System.out.print("Masukkan Status Pernikahan (1: Menikah, 2: Belum menikah, 3: Cerai, 4: Menikah dan punya anak): ");
        int sp = sc.nextInt();
        
        System.out.print("Masukkan Jumlah Anak: ");
        int ja = sc.nextInt();
        
        double gajiPokok = 0;
        
        switch (kg) {
            case 1:
                gajiPokok = 1200000;
                break;
            case 2:
                gajiPokok = 1500000;
                break;
            case 3:
                gajiPokok = 1750000;
                break;
            case 4:
                gajiPokok = 2000000;
                break;
            default:
                System.out.println("Kode golongan tidak valid.");
        }
        
        double tp = 0.10 * gajiPokok;
        
        double ta = 0.05 * gajiPokok * ja;

        double total = ta+ ta;
        
        double gajiBersih = gajiPokok + total;
        
        System.out.println("STRUK GAJI KARYAWAN");
        System.out.println("NIK          : " + nik);
        System.out.println("Nama         : " + nm);
        System.out.println("Gaji Pokok   : Rp " + gajiPokok);
        System.out.println("Tunjangan    : Rp " + total);
        System.out.println("Gaji Bersih  : Rp " + gajiBersih);
    }
}

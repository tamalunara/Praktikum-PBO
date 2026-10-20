package P3;

import java.util.Scanner;
public class Gaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        karyawan kr = new karyawan();
        HitungGaji hg = new HitungGaji();
        
        System.out.print("Nomor Induk Karyawan: ");
        kr.nik = input.nextLine();
        System.out.print("Nama Karyawan       : ");
        kr.nama = input.nextLine();
        System.out.print("Alamat              : ");
        kr.al = input.nextLine();
        System.out.print("Jabatan             : ");
        kr.jab = input.nextLine();
        System.out.print("Gaji Pokok          : ");
        hg.gp = input.nextDouble();
        System.out.print("Tunjangan Jabatan   : ");
        hg.jb = input.nextDouble();
        System.out.print("Tunjangan Istri     : ");
        hg.ti = input.nextDouble();
        System.out.print("Tunjangan Anak      : ");
        hg.ta = input.nextDouble();
        
        
      kr.OutputKaryawan();
      hg.OutputGaji();
      
    }
    
}

class karyawan{
    String nik;
    String nama;
    String al;
    String jab;
    
    public void OutputKaryawan(){
        System.out.println("Nomor Induk Karyawan: " + nik);
        System.out.println("Nama Karyawan       : " + nama);
        System.out.println("Alamat              : " + al);
        System.out.println("Jabatan             : " + jab);
    }
}

class HitungGaji{
    double jb;
    double ti;
    double ta;
    double gp;
    
    double totalGaji;
    double pajak;
    double gajiBersih;
    public void OutputGaji(){
        totalGaji = gp+jb+ti+ta;
        pajak = 0.10*(gp+jb+ta);
        gajiBersih = totalGaji-pajak;
        
        System.out.println("Gaji Pokok        :" + gp);
        System.out.println("Tunjangan Jabatan :" + jb);
        System.out.println("Tunjangan Istri   :" + ti);
        System.out.println("Tunjangan Anak    :" + ta);
        System.out.println("Total Gaji        :" + totalGaji);
        System.out.println("Pajak Pnghasilan  :" + pajak);
        System.out.println("Gaji Bersih       :" + gajiBersih);
        
        
    }
}
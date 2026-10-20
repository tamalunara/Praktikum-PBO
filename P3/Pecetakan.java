package P3;
import java.util.Scanner;
public class Pecetakan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int nvl, lbr, hr, jm, ttllbr, mnt;
        int dtk, ttldtk;
        
        System.out.print("Masukkan jumlah Novel: ");
        nvl = input.nextInt();
        System.out.print("Masukkan jumlah Lembar: ");
        lbr = input.nextInt();
        
        ttllbr = nvl * lbr;
        ttldtk = ttllbr;
        hr = 86400 / ttldtk;
        jm = (ttldtk % 86400) / 3600;
        mnt = (ttldtk % 3600) / 60;
        dtk = ttldtk % 60;
        
        System.out.println("Total Novel: " + nvl);
        System.out.println("Banyak Lembar: " + lbr);
        System.out.println("Total Lembar: " + ttllbr);
        System.out.println("Total Hari: " + hr);
        System.out.println("Total Jam: " + jm);
        System.out.println("Total Menit: " + mnt);
        System.out.println("Total Detik: " + dtk);
        
        
    }
}

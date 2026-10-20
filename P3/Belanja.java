package P3;
import java.io.*;
public class Belanja {
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);
        belanjaHitung blj = new belanjaHitung();
        
        System.out.print("Nama         : ");
        String nama = input.readLine();
        System.out.print("Total Belanja: ");
        blj.total = Double.parseDouble(input.readLine());
        System.out.print("Diskon       : ");
        blj.dis = Double.parseDouble(input.readLine());
        System.out.print("Bayar        : ");
        blj.byr = Double.parseDouble(input.readLine());
        
        System.out.println("Nama: "+nama);
        blj.hitung();
        
    }
}

class belanjaHitung{
    double total;
    double dis;
    double byr;
    double kembali;
    
    double hslDis;
    double ttl;
    public void hitung(){
        hslDis = (dis / 100) * total;
        ttl = total - hslDis;
        kembali = byr - ttl;
        
        System.out.println("Total Belanja: " + total);
        System.out.println("Diskon       : " + dis);
        System.out.println("Total        : " + ttl);
        System.out.println("Bayar        : " + byr);
        System.out.println("Kembalian    : " + kembali);
    }
}
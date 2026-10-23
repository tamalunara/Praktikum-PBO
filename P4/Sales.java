import java.util.Scanner;

public class Sales{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan total penjualan hari ini (Rp): ");
        double penjualan = scanner.nextDouble();
        
        double uangJasa = 0;
        double persentaseKomisi = 0;
        
        if (penjualan <= 2000000) {
            uangJasa = 100000;
            persentaseKomisi = 0.10; 
        } else if (penjualan > 2000000 && penjualan <= 5000000) {
            uangJasa = 200000;
            persentaseKomisi = 0.15; 
        } else {
            uangJasa = 300000;
            persentaseKomisi = 0.20; 
        }
        
        double komisi = persentaseKomisi * penjualan;
        double totalPendapatan = uangJasa + komisi;
        
        System.out.println("\n--- RINCIAN PENDAPATAN SALESMAN ---");
        System.out.println("Total Penjualan  : Rp " + penjualan);
        System.out.println("Uang Jasa        : Rp " + uangJasa);
        System.out.println("Komisi (" + (persentaseKomisi * 100) + "%) : Rp " + komisi);
        System.out.println("Total Pendapatan : Rp " + totalPendapatan);
        
        scanner.close();
    }
}
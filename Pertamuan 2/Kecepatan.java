package Praktikum;
 public class Kecepatan {
    public static void main(String[] args) {
        double jbb = 384400; 
        double jbm = 152100000; 
        double kecepatanCahaya = 300000;
        
        double wb = jbb / kecepatanCahaya;
        double wm = jbm / kecepatanCahaya;
        
        System.out.println("Waktu tempuh ke Bulan: " + wb + " detik");
        System.out.println("Waktu tempuh ke Matahari: " + wm + " detik");
    }
}
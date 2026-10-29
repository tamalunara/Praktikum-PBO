package Praktikum5;

import java.util.Scanner;

public class RataRataBilangan {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.print("Masukkan Bilangan: ");
        int n = s.nextInt();
        
        double ttl=0;
        for(int i=0; i<=n; i++){
            System.out.print("Masukkan Bilangan ke-"+i+": ");
            double bil = s.nextDouble();
            ttl += bil;
        }
        double rr = ttl/n;
        
        System.out.println("Total Jumlah Bilangan: "+ttl);
        System.out.println("Total Jumlah Rata-rata: "+rr);
        
    }
            
}

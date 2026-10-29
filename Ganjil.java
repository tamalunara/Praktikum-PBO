package Praktikum5;

import java.util.Scanner;

public class Ganjil {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.print("Masukkan Banyak Angka: ");
        int n = s.nextInt();
        
        int ttl=0, gjl=1;
        
        System.out.print("Output: ");
        for(int i=0; i<=n; i++){
            System.out.println(gjl+" ");
            gjl+=2;
        }
        System.out.println();
        System.out.println("Total: "+ttl);
    }
}

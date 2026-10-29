package Praktikum5;

import java.util.Scanner;

public class Floyds {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.print("Masukkan Banyak Baris: ");
        int bar = s.nextInt();
        
        int ang = 1;    
        for(int i=0; i<=bar; i++){
            for(int j=0; j<=i; j++){
                System.out.print(ang+" ");
                ang++;
            }
            System.out.println();
        }
    }
}

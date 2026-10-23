package Praktikum4;

import java.util.Scanner;
public class Modulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan Bilangan: ");
        int bil = sc.nextInt();
        
        if (bil % 2 == 0) {
            System.out.println(bil + " Adalah bilangan genap" );
        }else{
            System.out.println(bil + " Adalah bilangan ganjil" );
        }
    }
}

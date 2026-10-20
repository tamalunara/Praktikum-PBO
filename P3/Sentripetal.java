package P3;

import java.util.Scanner;
public class Sentripetal {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double m, v, r, F;
        
        System.out.print("Masukkan Nilai m: ");
        m = input.nextDouble();
        System.out.print("Masukkan Nilai v: ");
        v = input.nextDouble();
        System.out.print("Masukkan Nilai r: ");
        r = input.nextDouble();
        
        F = (m * v * v) / r;
        
        System.out.println("Hasil  : " + F);
        
    }
}

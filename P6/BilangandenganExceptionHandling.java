package praktikum6;

import java.util.Scanner;
import java.util.InputMismatchException;


public class BilangandenganExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        int n = sc.nextInt();
        
        double[] angka = new double[n];
        double total = 0;
        
        for (int i = 0; i < n; i++) {
            boolean valid = false;
            while (!valid) {
                try {
                    System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
                    angka[i] = sc.nextDouble();
                    total += angka[i];
                    valid = true; 
                } catch (InputMismatchException e) {
                    System.out.println("Error: Input bukan angka! Silakan masukkan angka yang valid.");
                    sc.nextLine(); 
                }
            }
        }
        
        System.out.println("\nNilai Rata-rata: " + (total / n));
    }
   
}

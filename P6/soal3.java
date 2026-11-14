
package praktikum6;

import java.util.Scanner;
import java.util.Arrays;

public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + i + ": ");
            arr[i] = scanner.nextInt();
        }

        int max = arr[0], min = arr[0];
        int idxMax = 0, idxMin = 0;
        int total = 0;
        int sumGanjil = 0, sumGenap = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) { max = arr[i]; idxMax = i; }
            if (arr[i] < min) { min = arr[i]; idxMin = i; }
            
            total += arr[i];

            if (i % 2 != 0) sumGanjil += arr[i]; 
            else sumGenap += arr[i];            
        }
        
        double rataRata = (double) total / n;
        
        System.out.println("\n--- Hasil ---");
        System.out.println("Nilai Terbesar: " + max + " (Indeks ke-" + idxMax + ")");
        System.out.println("Nilai Terkecil: " + min + " (Indeks ke-" + idxMin + ")");
        System.out.println("Total Penjumlahan: " + total);
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Jumlah Elemen Indeks Ganjil (NPM Genap): " + sumGanjil);
        System.out.println("Jumlah Elemen Indeks Genap (NPM Ganjil): " + sumGenap);
        
        
        if (sumGanjil % 2 == 0) {
            System.out.println("Hasil penjumlahan indeks ganjil adalah GENAP");
        } else {
            System.out.println("Hasil penjumlahan indeks ganjil adalah GANJIL");
        }
        
        Arrays.sort(arr);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(arr));
    }
}

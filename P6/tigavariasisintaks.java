package praktikum6;

import java.util.Arrays;
public class tigavariasisintaks {
    public static void main(String[] args) {
        // Variasi 1
        int[] angka1 = new int[3];
        angka1[0] = 5;
        angka1[1] = 10;
        angka1[2] = 15;

        // Variasi 2
        int[] angka2 = new int[]{100, 200, 300};

        // Variasi 3
        int[] angka3 = {2, 4, 6, 8};
        
        // Menampilkan isi array ke output
        System.out.println("Isi Variasi 1: " + Arrays.toString(angka1));
        System.out.println("Isi Variasi 2: " + Arrays.toString(angka2));
        System.out.println("Isi Variasi 3: " + Arrays.toString(angka3));
    }
}


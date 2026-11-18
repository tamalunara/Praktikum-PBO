package Praktikum6;

public class Perulangan {

    public void jalankan() {
        System.out.println("=== 9: Perulangan ===");

        int[] age = {12, 4, 5, 2, 6};

        System.out.println("Menggunakan for:");

        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        System.out.println("Menggunakan foreach:");

        for (int nilai : age) {
            System.out.println(nilai);
        }
    }
}
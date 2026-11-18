package Praktikum6;

public class Mobil {

    public void jalankan() {
        System.out.println("=== 2: Mengubah Nilai Array ===");

        String[] mobil = {
            "Tesla", "Suzuki", "Civic", "Mazda", "BMW"
        };

        mobil[1] = "Toyota";

        System.out.println("Nilai indeks setelah diubah diubah: " + mobil[1]);
    }
}
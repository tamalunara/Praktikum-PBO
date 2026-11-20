package Praktikum7;

public class SumpahPemuda {
    String teks;

    public SumpahPemuda() {
        this.teks = "Kami putra dan putri Indonesia";
    }

    public void tampilkan() {
        System.out.println(teks + ", mengaku bertumpah darah yang satu, tanah air Indonesia.");
        System.out.println(teks + ", mengaku berbangsa yang satu, bangsa Indonesia.");
        System.out.println(teks + ", menjunjung bahasa persatuan, bahasa Indonesia.");
    }

    public void jalankan() {
        System.out.println("=== 4: Teks Sumpah Pemuda ===");
        tampilkan();
    }
}
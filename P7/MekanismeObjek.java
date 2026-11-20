package Praktikum7;

class Mobil {
    String merk;
    String warna;

    void info() {
        System.out.println("Objek Mobil -> Merk: " + merk + ", Warna: " + warna);
    }
}

public class MekanismeObjek {
    public void jalankan() {
        System.out.println("=== 1: Mekanisme Kelas Menjadi Objek ===");
        System.out.println("Penjelasan Mekanisme:");
        System.out.println("1. Deklarasi : Menyiapkan variabel referensi bertipe kelas (contoh: MobilContoh m1;).");
        System.out.println("2. Instansiasi: Menggunakan kata kunci 'new' untuk mengalokasikan memori objek di Heap.");
        System.out.println("3. Inisialisasi: Memanggil konstruktor kelas untuk memberi nilai awal pada atribut objek.");
        System.out.println("\nContoh Hasil Eksekusi Program:");
        
        Mobil m1 = new Mobil();
        m1.merk = "Honda Civic";
        m1.warna = "Hitam";
        m1.info();
    }
}
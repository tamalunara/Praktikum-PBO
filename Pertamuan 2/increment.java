package Praktikum;

public class increment {
    public static void main(String[] args) {
        int angka = 5;
        System.out.println("Nilai awal x: " + angka);
        
        angka++;
        System.out.println("Setelah post-increment (x++): " + angka);
        
        ++angka;
        System.out.println("Setelah pre-increment (++x): " + angka);
    }
}

package P3;
import java.util.Scanner;
public class Selisih {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //untuk inputnya pakai detik
        double hslwk, wk1, wk2;
        
        System.out.print("Masukkan Waktu 1: ");
        wk1 = input.nextDouble();
        System.out.print("Masukkan Waktu 2: ");
        wk2 = input.nextDouble();
        
        hslwk = wk1 - wk2;
        
        System.out.println("Hasil Selisih waktu: " + hslwk);
    }
}

package P3;
import java.util.Scanner;
import java.io.*;


public class ScannerBufferReader {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //scanner : lebih simpel
        String nm, kls;
        System.out.println("Nama: ");
        nm = input.nextLine();
        System.out.println("Kelas: ");
        kls = input.nextLine();
        
        //buffereed reader : lebih rumit penulisannya, harus parse dulu
        System.out.println("Nama: ");
        String nama = br.readLine();
        System.out.println("Kelas: ");
        String kelas = br.readLine();
        
    }
}

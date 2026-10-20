package P3;
import java.io.*;
public class MiniMarket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
      Buah  b = new Buah();
        hitung ht = new hitung();
        
        System.out.print("Masukkan Jumlah Mangga: ");
        b.mg = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Jumlah Mangga Busuk: ");
        b.bsk = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Jumlah Tetangga: ");
        b.tgg = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Jumlah Jambu per Tetangga: ");
        b.jb = Integer.parseInt(br.readLine());
        
        b.output();
        ht.hitung(b.mg, b.bsk, b.tgg, b.jb);
    }
}

class Buah{
    int mg, bsk, tgg, jb;
    
    public void output(){
        System.out.println("Buah-Buahan");
        System.out.println("Jumlah Mangga: " + mg);
        System.out.println("Jumlah Mangga Busuk: " + bsk);
        System.out.println("Jumlah Tetangga: " + tgg);
        System.out.println("Jambu per Tetangga: " + jb);
    }
}

class hitung{
    int gabsk, ttljb, ttlbh;
    
    public void hitung(int m, int b, int t, int j){
        gabsk = m - b;
        ttljb = t*j;
        ttlbh = gabsk + ttljb;
        
        System.out.println("Buah Tidak Busuk: " + gabsk);
        System.out.println("Total Jambu: " + ttljb);
        System.out.println("Total Buah: " + ttlbh);
    }
}

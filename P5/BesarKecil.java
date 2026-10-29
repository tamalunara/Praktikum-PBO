package Praktikum5;

import java.util.Scanner;

public class BesarKecil {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int bsr=0, kcl=0;
        
        System.out.println("Masukkan Bilangan (10)");
        for(int i=1; i<=10; i++){
            System.out.print("Bilangan ke-"+i+" :");
            int bil = s.nextInt();
            if(i==1){
                bsr=bil;
                kcl=bil;
            }else{
                if(bil>bsr){
                    bsr=bil;
                }
                if(bil<kcl){
                    kcl=bil;
                }
            }
        }
        System.out.println("Bilangan Terbesar: "+bsr);
        System.out.println("Bilangan Terkecil: "+kcl);
    }
  
}

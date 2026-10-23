package Praktikum4;

import java.util.Scanner;

public class Kabisat {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
        System.out.print("Masukkan Tahun: ");
        int thn = sc.nextInt();
        
        boolean isKabisat = false;
        
        if(thn % 4 == 0){
            if(thn % 100 == 0){
                if(thn % 400 == 0){
                    isKabisat = true;
                }
            }
        }else{
            isKabisat = true;
        }
        
        if(isKabisat){
            System.out.println("tahun "+thn+" Adalah Tahun Kabisat");
        }else{
            System.out.println("tahun "+thn+" Bukan Tahun Kabisat");
        }
    }
}

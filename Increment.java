package Praktikum5;

public class Increment {
    public static void main(String[] args) {
        int i =0;
        while(i<3){
            System.out.println("Nilai i: "+ i++);
        }
        
        System.out.println();
        
        int j =0;
        while(j<3){
            System.out.println("Nilai j: "+ ++j);
        }
    }
}

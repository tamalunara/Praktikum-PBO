package Praktikum;

public class Segitiga {
    public static void main(String[] args) {
        double ang1 = 6;
        double ang2 = 8;
        
        double luas = 0.5 * ang1 * ang2;
        System.out.println("Luas Segitiga: " + luas);
        
        double ang3 = Math.sqrt((ang1 * ang1) + (ang2 * ang2));
        double kll = ang1 + ang2 + ang3;
        
        System.out.println("Nilai sisi miring (ang3): " + ang3);
        System.out.println("Keliling Segitiga: " + kll);
    }
}

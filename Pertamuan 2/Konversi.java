package Praktikum;

public class Konversi{
    public static void main(String[] args) {
        double C = 10, F = 15, R = 5;
      
        System.out.println("Celcius ke Fahrenheit: " + ((C * 9/5) + 32));
        System.out.println("Fahrenheit ke Celcius: " + ((F - 32) * 5/9));
        
        System.out.println("Celcius ke Reamur: " + (C * 4/5));
        System.out.println("Reamur ke Celcius: " + (R * 5/4));

        System.out.println("Fahrenheit ke Reamur: " + ((F - 32) * 4/9));
        System.out.println("Reamur ke Fahrenheit: " + ((R * 9/4) + 32));
    }
}

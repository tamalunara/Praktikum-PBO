package Praktikum6;

import java.util.ArrayList;

public class ArrList {

    public void jalankan() {
        System.out.println("=== 10: ArrayList ===");

        ArrayList<Object> data = new ArrayList<>();

        data.add(19); 
        data.add(0.2);
        data.add('C');
        data.add("Java");
        data.add(true);

        for (Object nilai : data) {
            System.out.println(nilai);
        }
    }
}
package Praktikum7;


class Teknik {
    String nama;
    String status;

    public Teknik(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    public void tampilkan() {
        System.out.println("Nama   : " + nama);
        System.out.println("Status : " + status + " (Civitas Akademika Fakultas Teknik)");
        System.out.println("----------------------------------------------");
    }
}


class Dosen extends Teknik {
    public Dosen(String nama) {
        super(nama, "Dosen");
    }
}


class Mahasiswa extends Teknik {
    public Mahasiswa(String nama) {
        super(nama, "Mahasiswa");
    }
}


class Staff extends Teknik {
    public Staff(String nama) {
        super(nama, "Staff");
    }
}

public class Civitas {
    public void jalankan() {
        System.out.println("=== 6: Civitas Akademika Fakultas Teknik ===");
        System.out.println("Hubungan Kelas: Inheritance");
        System.out.println("Civitas berperan sebagai Superclass, sedangkan Dosen, Mahasiswa, dan Staff adalah Subclass.\n");

        Dosen dsn = new Dosen("Mrs. Tamara Putri Dewanti S.Kom");
        Mahasiswa mhs = new Mahasiswa("Tamara Nibiru K");
        Staff stf = new Staff("Bareska Harsachandra");

        dsn.tampilkan();
        mhs.tampilkan();
        stf.tampilkan();
    }
}
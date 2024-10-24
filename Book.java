// Kelas Induk (SuperClass)
class Kendaraan {
    int jumlahRoda;
    String bahanBakar;

    // Constructor
    public Kendaraan(int jumlahRoda, String bahanBakar) {
        this.jumlahRoda = jumlahRoda;
        this.bahanBakar = bahanBakar;
    }

    // Metode yang dimiliki oleh semua kendaraan
    public void bergerak() {
        System.out.println("Kendaraan bergerak dengan " + 
        jumlahRoda + " roda menggunakan " + bahanBakar);
    }
}

// Kelas Turunan (SubClass) yang mewarisi dari Kendaraan
class Mobil extends Kendaraan {
    String tipeMobil;

    // Constructor untuk kelas turunan
    public Mobil(int jumlahRoda, String bahanBakar, String tipeMobil) {
        // Memanggil constructor kelas induk
        super(jumlahRoda, bahanBakar);
        this.tipeMobil = tipeMobil;
    }

    // Metode tambahan untuk Mobil
    public void membukaBagasi() {
        System.out.println("Bagasi mobil " + tipeMobil + " dibuka.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Mobil
        Mobil mobilBaru = new Mobil(4, "Bensin", "SUV");

        // Memanggil metode dari kelas induk
        mobilBaru.bergerak();

        // Memanggil metode khusus dari kelas turunan
        mobilBaru.membukaBagasi();
    }
}

class Mobil {
    String merk;
    String warna;
    int tahun;
    int kecepatan = 0;

    void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk  :" + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
        System.out.println("");
    }
    void percepat () {
        kecepatan = kecepatan + 20;
        System.out.println("Mobil dipercepat....");
    }
    void tampilkanKecepatan() {
        System.out.println("Kecepatan saat ini : " + kecepatan + " km/jam");
    }
    public static void main(String [] args) {
        Mobil mobilPertama = new Mobil();

        mobilPertama.merk = "Toyota Avanza";
        mobilPertama.warna = "Silver";
        mobilPertama.tahun = 2020;

        mobilPertama.tampilkanSpesifikasi();

        mobilPertama.percepat();
        mobilPertama.percepat();

        mobilPertama.tampilkanKecepatan();
    }
}
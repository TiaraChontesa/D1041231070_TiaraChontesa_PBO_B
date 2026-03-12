public class LatihanMobilOverLoading {
    static class Mobil {
        String merk;
        String warna;
        int tahun;

        Mobil() {
            merk = "Unknown";
            warna = "Unknown";
            tahun = 0;
        }

        Mobil(String merk) {
            this.merk = merk;
            warna = "Unknown";
            tahun = 0;
        }

        Mobil(String merk, String warna, int tahun) {
            this.merk = merk;
            this.warna = warna;
            this.tahun = tahun;
        }

        void tampilkanSpesifikasi() {
            System.out.println("=== SPESIFIKASI MOBIL ===");
            System.out.println("Merk : " + merk);
            System.out.println("Warna : " + warna);
            System.out.println("Tahun : " + tahun);
             System.out.println("");
        }
    }
    public static void main(String[] args) {
        Mobil mobilPertama = new Mobil();
        Mobil mobilKedua = new Mobil("Toyota");
        Mobil mobilKetiga = new Mobil("Honda Civic", "Merah", 2023);

        mobilPertama.tampilkanSpesifikasi();
        mobilKedua.tampilkanSpesifikasi();
        mobilKetiga.tampilkanSpesifikasi();
    }
}
class Buku {
    
    String judul;
    String pengarang;
    int harga;

    Buku() {
        judul = "Belum diisi";
        pengarang = "Belum diisi";
        harga = 0;
    }

    Buku (String judul, String pengarang, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul       : " + judul);
        System.out.println("Pengarang   : " + pengarang);
        System.out.println("Harga       : Rp " + harga);
        System.out.println("");
    }
}
public class LatihanBukuConstructor {
    public static void main (String [] args) {
        Buku bukuPertama = new Buku();
        Buku bukuKedua = new Buku("Pemrograman Java", "Budi Raharjo", 125000);
        Buku bukuKetiga = new Buku("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);

        bukuPertama.tampilkanInfo();
        bukuKedua.tampilkanInfo();
        bukuKetiga.tampilkanInfo();
    }
}
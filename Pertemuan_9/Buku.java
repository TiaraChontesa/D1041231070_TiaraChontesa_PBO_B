class Buku {
    String judul;
    String pengarang;
    int harga;

    void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul       : " + judul);
        System.out.println("Pengarang   : " + pengarang);
        System.out.println("Harga       : " + harga);
        System.out.println("");
    }
    public static void main(String[] args) {
        Buku bukuPertama = new Buku();
        bukuPertama.judul = "Pemrograman Java";
        bukuPertama.pengarang = "Budi Raharjo";
        bukuPertama.harga = 125000;

        Buku bukuKedua = new Buku();
        bukuKedua.judul = "Algoritma dan Struktur Data";
        bukuKedua.pengarang = "Rinaldi Munir";
        bukuKedua.harga = 150000;

        bukuPertama.tampilkanInfo();
        bukuKedua.tampilkanInfo();

    }

}

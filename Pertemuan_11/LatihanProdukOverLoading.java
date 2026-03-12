public class LatihanProdukOverLoading {
    static class Produk {
        String namaProduk;
        int harga;
        int stok;

        Produk(String namaProduk, int harga) {
            this.namaProduk = namaProduk;
            this.harga = harga;
            this.stok = 0;
        }

        Produk(String namaProduk, int harga, int stok) {
            this.namaProduk = namaProduk;
            this.harga = harga;
            this.stok = stok;
        }

        void tampilkanInfo() {
            System.out.println("=== INFORMASI PRODUK ===");
            System.out.println("Nama Produk : " + namaProduk);
            System.out.println("Harga : " + harga);
            System.out.println("Stok : " + stok);
            System.out.println("");


        }
    }
    public static void main(String[] args) {
        Produk produkPertama = new Produk("Laptop ASUS", 8500000);
        Produk produkKedua = new Produk("Mouse Logitech", 250000, 50);

        produkPertama.tampilkanInfo();
        produkKedua.tampilkanInfo();
    }
}
public class LatihanProduk {
    public static final double PAJAK = 0.11;
    public static void main (String[] args) {
        // deklarasi string
        String namaProduk = "Laptop Asus";

        //deklarasi int
        int hargaSatuan = 7000000;
        int jumlahStok = 15;
        
        //deklarasi boolean
        boolean isStatus = true;

        int totalNilaiStok = hargaSatuan * jumlahStok;
        double totalPajak = totalNilaiStok * PAJAK;

        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk         : " + namaProduk);
        System.out.println("Harga Satuan        : Rp " + hargaSatuan);
        System.out.println("Jumlah Stok         : " + jumlahStok);
        System.out.println("Status Tersedia     : " + isStatus);
        System.out.println("---");
        System.out.println("Total Nilai Stok    : Rp " + totalNilaiStok);
        System.out.printf("Pajak (11%%)         : Rp %.0f%n", totalPajak);




    }
}
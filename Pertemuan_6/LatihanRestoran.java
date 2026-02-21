public class LatihanRestoran {
    public static void main(String[] args) {
        System.out.println("=== MENU RESTORAN ===");
        int kodeMenu = 1;
        int jumlahPesanan = 2;
        int hargaMenu = 0;
        int totalBayar = 0;

        System.out.println("Kode Menu : " + kodeMenu);
        System.out.println("Jumlah : " + jumlahPesanan);
        System.out.println("");
        System.out.println("Pesanan Anda : ");

        switch (kodeMenu) {
            case 1:
                System.out.println("Nama Menu : Nasi Goreng"); 
                hargaMenu = 15000;
                totalBayar = hargaMenu * jumlahPesanan;
                break;
             case 2:
                System.out.println("Nama Menu : Mie Ayam");
                hargaMenu = 12000;
                totalBayar = hargaMenu * jumlahPesanan;
                break;
             case 3:
                System.out.println("Nama Menu : Bakso");
                hargaMenu = 10000;
                totalBayar = hargaMenu * jumlahPesanan;
                break;
             case 4:
                System.out.println("Nama Menu : Soto Ayam");
                hargaMenu = 13000;
                totalBayar = hargaMenu * jumlahPesanan;
                break;
             case 5:
                System.out.println("Nama Menu : Es Teh");
                hargaMenu = 3000;
                totalBayar = hargaMenu * jumlahPesanan;
                break;
        }
        System.out.println("Harga Satuan : Rp " + hargaMenu);
        System.out.println("Jumlah : " + jumlahPesanan);
        System.out.println("---");
        System.out.println("Total Bayar : Rp " + totalBayar);
    }
}
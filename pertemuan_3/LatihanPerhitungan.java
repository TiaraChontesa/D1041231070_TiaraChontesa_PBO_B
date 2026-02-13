public class LatihanPerhitungan {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        
        //tipe data int
        int saldoawal = 1000000;
        //menampilkan saldo awal
        System.out.println("Saldo Awal              : " + saldoawal);

        int setoran = 500000;
        //Menampilkan setoran
        System.out.println("Setoran                 : " + setoran);

        //menampilkan hasil setoran
        int hasil = saldoawal + setoran;
        System.out.println("Saldo Setelah Setor     : " + hasil);

        int tarik = 250000;
        //Menampilkan saldo penarikan
        System.out.println("Penarikan               : " + tarik);

        //menampilkan saldo akhir
        int saldoakhir = hasil - tarik;
        System.out.println("Saldo Akhir             : " + saldoakhir);

    } 
}
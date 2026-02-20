public class LatihanDiskon {
    public static void main(String[] args) {
        System.out.println("=== KALKULATOR DISKON ===");

        double totalBelanja = 750000.0;

        double totalDiskon = 0;

        System.out.println("Total Belanja :" + totalBelanja);

        if(totalBelanja < 100000)
        {
            System.out.println("Tidak Ada Diskon");
        }
        else if(totalBelanja >=100000 && totalBelanja <=499999)
        {
            totalDiskon = 0.05 * totalBelanja;
            System.out.println("Diskon (5%) : Rp " + totalDiskon);
            System.out.println("Harga Akhir : Rp " + (totalBelanja - totalDiskon));
            System.out.println("Anda Hemat : Rp " + (totalDiskon));
        }
        else if(totalBelanja >= 500000 && totalBelanja <= 999999)
        {
            totalDiskon = 0.10 * totalBelanja;
            System.out.println("Diskon (10%)    : Rp " + totalDiskon);
            System.out.println("Harga Akhir    : Rp " + (totalBelanja - totalDiskon));
            System.out.println("Anda Hemat     : Rp " + (totalDiskon));
        }
        else
        {
            totalDiskon = 0.15 * totalBelanja;
            System.out.println("Diskon (5%)    : Rp " + totalDiskon);
            System.out.println("Harga Akhir    : Rp " + (totalBelanja - totalDiskon));
            System.out.println("Anda Hemat     : Rp " + (totalDiskon));
        }

    }
}
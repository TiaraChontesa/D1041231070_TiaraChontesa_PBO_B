public class LatihanBilangan {
    public static void main(String[] args) {
        System.out.println("=== PEMERIKSAAN BILANGAN ===");

        int number = -7;
        String jenisBilangan = (number >=0) ? "Bilangan Positif" : "Bilangan Negatif";
        String tipeBilangan = (number % 2 ==0) ? "Genap" : "Ganjil"; 

        System.out.println("Bilangan    : " + number);
        System.out.println("Jenis       : " + jenisBilangan);
        System.out.println("Tipe        : " + tipeBilangan);

    }
}
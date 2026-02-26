public class LatihanRefleksi {
    public static void main(String[] args) {
        System.out.println("=== MENGGUNAKAN WHILE ===");
        int angka = 1;
        while (angka <= 5) {
            System.out.print(angka + " ");
            angka++;
        }
        System.out.println("");

        System.out.println("=== MENGGUNAKAN DO-WHILE ===");
        angka = 1;
        do {
            System.out.print(angka + " ");
            angka++;
        } while (angka <= 5);

        System.out.println(""); 

        System.out.println("=== MENGGUNAKAN FOR ===");
        for (angka = 1; angka <= 5; angka++) {
            System.out.print(angka + " ");
        }
    }
}
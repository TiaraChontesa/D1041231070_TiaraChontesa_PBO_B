public class LatihanKalkulator {
    public static void main(String[] args) {
        int angka1 = 25;
        int angka2 = 4;

        System.out.println("=== KALKULATOR ===");
        System.out.println("Angka 1 = 25");
        System.out.println("Angka 2 = 4");
        System.out.println("---");
        //penjumlahan
        System.out.println("Penjumlahan : " + (angka1 + angka2));
        //pengurangan
        System.out.println("Pengurangan : " + (angka1 - angka2));
        //perkalian
        System.out.println("Perkalian   : " + (angka1 * angka2));
        //pembagian
        System.out.println("Pembagian   : " + (angka1 / angka2));
        //sisa bagi
        System.out.println("Sisa Bagi   : " + (angka1 % angka2));

        //pembagian desimal
        double bilanganPertama= 25;
        double bilanganKedua= 4;
        double pembagianDesimal = bilanganPertama/bilanganKedua;

        System.out.println("Pembagian Desimal : " + pembagianDesimal);

    } 
}
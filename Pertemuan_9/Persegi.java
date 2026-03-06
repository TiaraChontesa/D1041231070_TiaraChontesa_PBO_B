class Persegi {
    int sisi;
    int luas;
    int keliling;

    void hitungLuas() {
        luas = sisi * sisi;
    }
    void hitungKeliling() {
        keliling = 4 * sisi;
    }
    void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi        : " + sisi + " cm");
        System.out.println("Luas        : " + luas + " cm2");
        System.out.println("Keliling    : " + keliling + " cm");
    }

    public static void main (String [] args) {
        Persegi persegiLuas = new Persegi();
        persegiLuas.sisi = 5;
        persegiLuas.hitungLuas();
        persegiLuas.hitungKeliling();
        persegiLuas.tampilkanHasil();
    }
}
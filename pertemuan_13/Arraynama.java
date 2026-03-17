public class Arraynama {
    public static void main(String[] args) {

        String[] nama = {"Andi", "Budi", "Citra", "Deni", "Eka"};

        System.out.println("=== DAFTAR NAMA ===");

        for(int i = 0; i < nama.length; i++) {
            System.out.println((i+1) + ". " + nama[i]);
        }
    }
}
public class LatihanValidasi {
    public static void main(String[] args) {
        int[] angka = {-10, 150, 85}; 
        int i = 0;
        int nilai;

        System.out.println("=== VALIDASI NILAI UJIAN ===");

        do {
            nilai = angka[i];
            System.out.println("Percobaan input: " + nilai);

            if (nilai < 0 || nilai > 100) {
                System.out.println("Error: Nilai harus antara 0-100!");
                i++;
            } else {
                System.out.println("✓ Nilai valid: " + nilai);
                break;
            }
        } while (true);
    }
}
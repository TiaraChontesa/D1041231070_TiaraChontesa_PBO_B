public class VarArgsRataRata {
    static double hitungRataRata(int... nilai) {
        int total = 0;

        for (int n : nilai) {
            total += n;
        }
        return (double) total / nilai.length;
    }

    public static void main(String[] args) {
        System.out.println("Rata-rata (3 nilai): " + hitungRataRata(70, 80, 90));
        System.out.println("Rata-rata (5 nilai): " + hitungRataRata(80, 85, 90, 88, 87));
    }
}
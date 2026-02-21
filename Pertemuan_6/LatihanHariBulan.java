public class LatihanHariBulan {
    public static void main(String[] args) {
        System.out.println("=== JUMLAH HARI DALAM BULAN ===");

        int monthName = 4;

        switch (monthName) {
            case 1:
                System.out.println("Bulan : Januari (bulan ke-1)");
            case 3:
                System.out.println("Bulan : Maret (bulan ke-3)");
            case 5:
                System.out.println("Bulan : Mei (bulan ke-5)");
            case 7:
                System.out.println("Bulan : Juli (bulan ke-7)");
            case 8:
                System.out.println("Bulan : Agustus (bulan ke-8)");
            case 10:
                System.out.println("Bulan : Oktober (bulan ke-10)");
            case 12:
                System.out.println("Bulan ini memiliki 31 hari");
                break;
            
            case 4:
                System.out.println("Bulan : April (bulan ke-4)");
            case 6:
                System.out.println("Bulan : Juni (bulan ke-6)");
            case 9:
                System.out.println("Bulan : September (bulan ke-9)");
            case 11:
                System.out.println("Bulan ini memiliki 30 hari");
                break;
            
            default:
                System.out.println("Bulan tidak valid");
        }
    }
}
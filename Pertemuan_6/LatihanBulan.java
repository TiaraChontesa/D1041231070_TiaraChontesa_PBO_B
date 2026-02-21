public class LatihanBulan {
    public static void main(String[] args) {
        System.out.println("=== KONVERSI BULAN ===");
        int angkaBulan = 5;
        String namaBulan;

        System.out.println("Angka Bulan : " + angkaBulan);

        switch(angkaBulan) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                namaBulan = "Angka Bulan Tidak Valid (1-12)";
        }
        if(angkaBulan <=12 && angkaBulan >0)
        {
            System.out.println("Nama Bulan : " + namaBulan);
        }
        else
        {
            System.out.println("Error : " + namaBulan);
        }
    }
}
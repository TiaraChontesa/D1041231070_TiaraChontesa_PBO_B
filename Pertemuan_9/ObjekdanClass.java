class Mobil {
    String merek = "Pajero";
    String warna = "Putih";
    int tahun = 2020;
    int kecepatan1;
    int kecepatan2;
    int percepatan;

    public void percepat() {
        percepatan = (kecepatan2 - kecepatan1) / 2;
    }
}

public class ObjekdanClass {
    public static void main(String args[]) {

        Mobil obj = new Mobil();

        System.out.println("Merek : " + obj.merek);
        System.out.println("Warna : " + obj.warna);
        System.out.println("Tahun : " + obj.tahun);

        obj.kecepatan1 = 60;
        obj.kecepatan2 = 80;

        obj.percepat();  

        System.out.println("Percepatan : " + obj.percepatan);
    }
}
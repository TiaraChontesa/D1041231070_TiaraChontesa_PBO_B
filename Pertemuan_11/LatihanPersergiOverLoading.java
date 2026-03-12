public class LatihanPersergiOverLoading {
    static class Persegipanjang {
        int panjang;
        int lebar;
        int luas;
        int keliling;

        Persegipanjang(int sisi) {
            this.panjang = sisi;
            this.lebar = sisi;
            this.luas = panjang * lebar;
            this.keliling = 2 * (panjang + lebar);
        }

        Persegipanjang(int panjang, int lebar) {
            this.panjang = panjang;
            this.lebar = lebar;
            this.luas = panjang * lebar;
            this.keliling = 2 * (panjang + lebar);
        }
        void tampilkanHasil(String tipe) {
            System.out.println("===" + tipe + "===");
            System.out.println("Panjang : " + panjang + " cm");
            System.out.println("Lebar : " + lebar + " cm2");
            System.out.println("Luas : " + luas + " cm2");
            System.out.println("Keliling : " + keliling + " cm2");
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Persegipanjang persegiPertama = new Persegipanjang(5);
        Persegipanjang persegiKedua = new Persegipanjang(8,4);
        
        persegiPertama.tampilkanHasil("PERSERGI");
        persegiKedua.tampilkanHasil("PERSERGI PANJANG");
    }
}
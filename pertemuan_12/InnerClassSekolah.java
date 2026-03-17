class Sekolah {
    String namaSekolah;

    Sekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    class Kelas {
        String namaKelas;

        Kelas(String namaKelas) {
            this.namaKelas = namaKelas;
        }

        void info() {
            System.out.println("Sekolah : " + namaSekolah);
            System.out.println("kelas : " + namaKelas);
        }
    }
}

public class InnerClassSekolah {
    public static void main (String[] args)  {
        Sekolah sekolahSaya = new Sekolah ("SMA Negeri 1");
        Sekolah.Kelas kelasSaya = sekolahSaya.new Kelas ("X-A");

        kelasSaya.info();
    }
}
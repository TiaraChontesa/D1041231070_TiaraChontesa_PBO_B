class Mahasiswa {
    static int jumlahMahasiswa = 0;
    String nama;


    Mahasiswa(String nama) {
        this.nama = nama;
        jumlahMahasiswa++;
        System.out.println("Mahasiswa dibuat : " + nama);

    }

    static int getJumlah() {
        return jumlahMahasiswa;
    }
}

public class StaticCounter {
    public static void main (String[] args) {
        Mahasiswa mahasiswaPertama = new Mahasiswa("Andi");
        Mahasiswa mahasiswaKedua = new Mahasiswa("Budi");
        Mahasiswa mahasiswaKetiga = new Mahasiswa("Citra");

        System.out.println("");
        System.out.println("Total Mahasiswa : " + Mahasiswa.getJumlah());
          
    }
}
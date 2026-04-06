package tugaspraktikum.tugaspraktikum6;

public class Manusia {
    private String nama;
    private boolean jenisKelamin; // true untuk laki-laki, false untuk perempuan
    private String nik;
    private boolean menikah; // true untuk menikah, false untuk belum menikah

    public  Manusia(){

    }
    public  Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public double getTunjangan() {
  
        if (menikah) {
            if (jenisKelamin) { 
                return 25.0;
            } else { // Perempuan
                return 20.0;
            }
        }else {
            return 15.0; 
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString(){
        return String.format(
            "Nama: %s\nJenis Kelamin: %s\nNIK: %s\nMenikah: %s\nPendapatan: %.2f",
                nama, jenisKelamin ? "Laki-laki" : "Perempuan", nik, menikah ? "Ya" : "Tidak", getPendapatan());
    }
    

}
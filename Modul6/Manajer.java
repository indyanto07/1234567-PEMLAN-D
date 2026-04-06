package tugaspraktikum.tugaspraktikum6;

public class Manajer extends Pekerja {
    private String departemen;
    public Manajer(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji,int bulanMasuk, int tanggalMasuk, int tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, bulanMasuk, tanggalMasuk, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }
    
    public String getDepartemen() {
        return departemen;
    }
    
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (0.1 * getGaji()); 
    }
    
    public String toString() {
        return String.format("%s\nDepartemen: %s", super.toString(), departemen);
    }
}

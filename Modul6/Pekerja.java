package tugaspraktikum.tugaspraktikum6;

public class Pekerja extends Manusia {
    private double gaji;
    private int tahunMasuk;
    private int jumlahAnak;
    private int tanggalMasuk;
    private int bulanMasuk;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji,int bulanMasuk, int tanggalMasuk, int tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
        this.tanggalMasuk = tanggalMasuk;
        this.bulanMasuk = bulanMasuk;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public void setTanggalMasuk(int tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }
    public void setBulanMasuk(int bulanMasuk) {
        this.bulanMasuk = bulanMasuk;
    }

    public int getTanggalMasuk() {
        return tanggalMasuk;
    }

    public int getBulanMasuk() {
        return bulanMasuk;
    }



    public double getGaji() {
        return gaji;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getBonus() {
        int tahunKerja = 2026 - tahunMasuk;
        double bonus = 0.0;
        if (tahunKerja >=0 && tahunKerja < 5) {
            bonus += gaji * 0.05;
            return gaji ; 
        } else if (tahunKerja >= 5 && tahunKerja <= 10) {
            bonus += gaji * 0.1;
            return bonus; 
        }else{
            bonus += gaji * 0.15;
            return bonus; 
        }
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (jumlahAnak * 20.0); 
    }
    @Override
    public double getPendapatan() {
        return gaji+getBonus() + getTunjangan();
    }

    @Override
    public String toString() {
        return String.format("%s\nTahun Masuk:%d %d %d\nJumlah Anak: %d\nGaji: %,.2f\nBonus: %,.2f\nTunjangan: %,.2f\nTotal Pendapatan: %,.2f",
                super.toString(),tanggalMasuk, bulanMasuk, tahunMasuk, jumlahAnak, gaji, getBonus(), getTunjangan(), getPendapatan());
    }
}

package tugaspraktikum.tugaspraktikum7;

public class KueJadi extends Kue {
    private double jumlah;
    public KueJadi(String nama, Double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    
    }
    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
    @Override
    public double hitungHarga() {
        return getHarga() * jumlah;
    }

    @Override
    public String toString() {
        return String.format("%s \n| Jumlah: %.0f\n", super.toString(), jumlah);
    }
    
}

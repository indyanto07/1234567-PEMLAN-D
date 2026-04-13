package tugaspraktikum.tugaspraktikum7;

public class KuePesanan extends Kue {
    private double berat;
    public KuePesanan(String nama, Double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }
    public void setBerat(double berat) {
        this.berat = berat;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * berat;
    }

    @Override
    public String toString() {
        return String.format("%s \n| Berat: %.2f kg\n", super.toString(), berat);
    }

    
}

package tugaspraktikum.tugaspraktikum7;

abstract class Kue {
    private String nama;
    private Double harga;

    public Kue(String nama, Double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public Double getHarga() {
        return harga;       
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public double hitungHarga(){
        return harga;
    }

    @Override
    public String toString() {
        return String.format("Nama Kue: %-20s \n| Harga Dasar: Rp%,.2f", nama, harga);
    }
    
}

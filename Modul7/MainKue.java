package tugaspraktikum.tugaspraktikum7;

public class MainKue {
    public static void main(String[] args) {
        Kue [] kueArray = new Kue[20];

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                kueArray[i] = new KuePesanan("Kue Pesanan " + (i+1), 10000.0, 0.5 + i);
            } else {
                kueArray[i] = new KueJadi("Kue Jadi " + (i+1), 15000.0, 1 + i);
            }

        
        }

        double totalHargaSemua = 0;
        double totalHargaPesanan = 0, totalBeratPesanan = 0;
        double totalHargaJadi = 0, totalJumlahJadi = 0;
        Kue kueTermahal = kueArray[0];

       System.out.println("=== DAFTAR KUE ===");
        for (Kue k : kueArray) {
           
            System.out.println(k); 

            totalHargaSemua += k.hitungHarga();

            if (k instanceof KuePesanan) {
            KuePesanan kp = (KuePesanan) k;
            totalHargaPesanan += kp.hitungHarga();
            totalBeratPesanan += kp.getBerat();
            } 
            else if (k instanceof KueJadi) {
            KueJadi kj = (KueJadi) k;
            totalHargaJadi += kj.hitungHarga();
            totalJumlahJadi += kj.getJumlah();
        }

    // e. Mencari harga terbesar
    if (k.hitungHarga() > kueTermahal.hitungHarga()) {
        kueTermahal = k;
    }
}

        System.out.println("\n=== KUE KUE ===");
        System.out.printf("Total Harga Semua Kue: %,.2f\n", totalHargaSemua);
        System.out.printf("Total Harga Kue Pesanan: %,.2f | Total Berat: %.2f\n", totalHargaPesanan, totalBeratPesanan);
        System.out.printf("Total Harga Kue Jadi: %,.2f  | Total Jumlah: %.0f\n", totalHargaJadi, totalJumlahJadi);
        System.out.println("\n=== KUE TERMAHAL ===");
        System.out.printf("Nama: " + kueTermahal.getNama() + " dengan harga: %,.2f\n", kueTermahal.hitungHarga());
    }
}

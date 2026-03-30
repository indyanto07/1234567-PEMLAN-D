package tugaspraktikum.tugaspraktikum5;

public class Labkomdas {
    // Harga dasar dan harga diskon dideklarasikan sebagai FINAL
    private final int HARGA_A = 100000;
    private final int HARGA_B = 125000;
    private final int HARGA_C = 175000;

    private final int DISKON_A = 95000;
    private final int DISKON_B = 120000;
    private final int DISKON_C = 160000;

    // Method untuk menentukan harga satuan berdasarkan jumlah beli
    public int getHargaSatuan(String tipe, int jumlah) {
        if (tipe.equalsIgnoreCase("A")) {
            if (jumlah > 100) {
                return DISKON_A;
            } else {
                return HARGA_A;
            }
        } else if (tipe.equalsIgnoreCase("B")) {
            if (jumlah > 100) {
                return DISKON_B;
            } else {
                return HARGA_B;
            }
        } else if (tipe.equalsIgnoreCase("C")) {
            if (jumlah > 100) {
                return DISKON_C;
            } else {
                return HARGA_C;
            }
        }
        return 0;
    }

    public void tampilkanMenu() {
        System.out.println("===== DAFTAR HARGA JAKET CV. LABKOMDAS =====");
        System.out.println("Jaket A : Rp " + HARGA_A);
        System.out.println("Jaket B : Rp " + HARGA_B);
        System.out.println("Jaket C : Rp " + HARGA_C);
        System.out.println("\nJika beli lebih dari 100, harga akan mendapatkan diskon menjadi:");
        System.out.println("Jaket A : Rp " + DISKON_A );
        System.out.println("Jaket B : Rp " + DISKON_B );
        System.out.println("Jaket C : Rp " + DISKON_C );
        System.out.println("============================================\n");
    }
}

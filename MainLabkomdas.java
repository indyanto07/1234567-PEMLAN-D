package tugaspraktikum.tugaspraktikum5;

import java.util.Scanner;

public class MainLabkomdas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Labkomdas a = new Labkomdas();

        a.tampilkanMenu();

        System.out.print("Masukkan jumlah Jaket A : ");
        int jmlA = in.nextInt();
        System.out.print("Masukkan jumlah Jaket B : ");
        int jmlB = in.nextInt();
        System.out.print("Masukkan jumlah Jaket C : ");
        int jmlC = in.nextInt();

        // Hitung harga per item
        int hargaA = a.getHargaSatuan("A", jmlA);
        int hargaB = a.getHargaSatuan("B", jmlB);
        int hargaC = a.getHargaSatuan("C", jmlC);

        long totalA = (long) jmlA * hargaA;
        long totalB = (long) jmlB * hargaB;
        long totalC = (long) jmlC * hargaC;
        long totalBayar = totalA + totalB + totalC;

        System.out.println("\n========== STRUK PEMBELIAN ==========");
        System.out.println("-------------------------------------");
        System.out.printf("Jaket A : %d x Rp%,d = Rp%,d\n", jmlA, hargaA, totalA);
        System.out.printf("Jaket B : %d x Rp%,d = Rp%,d\n", jmlB, hargaB, totalB);
        System.out.printf("Jaket C : %d x Rp%,d = Rp%,d\n", jmlC, hargaC, totalC);
        System.out.println("-------------------------------------");
        System.out.printf("TOTAL BAYAR : Rp%,d\n", totalBayar);
        System.out.println("=====================================");
    }
}

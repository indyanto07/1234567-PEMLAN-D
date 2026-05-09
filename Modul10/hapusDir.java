package tugaspraktikum.tugaspraktikum10;
import java.io.File;
import java.util.Scanner;

public class hapusDir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama direktori yang ingin dihapus: ");
        String namaDirektori = scanner.nextLine();
        File direktori = new File(namaDirektori);

        if (direktori.exists() && direktori.isDirectory()) {
            File[] daftarFile = direktori.listFiles();
            if (daftarFile != null) {
                for (File file : daftarFile) {
                    if (file.delete()) {
                        System.out.println("File " + file.getName() + " berhasil dihapus");
                    }
                }
            }

            if (direktori.delete()) {
                System.out.println("Direktori berhasil dihapus");
            } else {
                System.out.println("Gagal menghapus direktori");
            }
        } else {
            System.out.println("Direktori tidak ditemukan");
        }
    }
}
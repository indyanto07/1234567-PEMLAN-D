package tugaspraktikum.tugaspraktikum10;
import java.io.File;
public class cekMemoriFile {
    public static void main(String[] args) {
        var file = new File("test.txt");
        if (file.exists()) {
            long memori = file.length();

            if  (memori < 1024 * 1024) {
                System.out.printf("Ukuran file: %.2f KB%n", memori / 1024.0);
            } else {
                System.out.printf("Ukuran file: %.2f MB%n", memori / (1024.0 * 1024.0));
            }
        } else {
            System.out.println("File tidak ada");
        }
    }
}

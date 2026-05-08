package tugaspraktikum.tugaspraktikum10;
import java.io.File;
public class cekMemoriFile {
    public static void main(String[] args) {
        var file = new File("test.txt");
        if (file.exists()) {
            long memori = file.length();

            if (memori < 1024) {
                System.out.println("Ukuran file: " + memori + " KB");
            } else if (memori < 1024 * 1024) {
                System.out.println("Ukuran file: " + memori / 1024.0 + " MB");
            } 
        } else {
            System.out.println("File tidak ada");
        }
    }
}

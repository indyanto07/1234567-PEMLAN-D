package tugaspraktikum.tugaspraktikum10;
import java.io.File;

public class isiDir {
    public static void main(String[] args) {
        var file = new File("E:\\Semester 2\\tugaspraktikum\\tugaspraktikum10");
        if (file.exists() && file.isDirectory()) {
            String[] isiDir = file.list();
            System.out.println("Isi direktori:");
            for (String namaFile : isiDir) {
                System.out.println(namaFile);
            }
        } else {
            System.out.println("Direktori tidak ditemukan");
        }
    }
}
package tugaspraktikum.tugaspraktikum6;

public class MainManusia {
    public static void main(String[] args) {
        System.out.println("=== Manusia ===");
        Manusia a = new Manusia("A", true, "111", true);
        System.out.println(a);
        System.out.println();
        Manusia b = new Manusia("B", false, "111", true);
        System.out.println(b);
        System.out.println();
        Manusia c = new Manusia("C", false, "111", false);
        System.out.println(c);
        System.out.println();
        
        System.out.println("=== MahasiswaFILKOM ===");
        MahasiswaFILKOM d = new MahasiswaFILKOM("D",  true, "111", false, "165150300111100", 2.7); 
        System.out.println(d);
        System.out.println();
        
        MahasiswaFILKOM e = new MahasiswaFILKOM("E",  true, "111", false, "165150300111100", 3.3); 
        System.out.println(e);
        System.out.println();
        
        MahasiswaFILKOM f = new MahasiswaFILKOM("F",  true, "111", false, "165150300111100", 4.0); 
        System.out.println(f);
        System.out.println();
        
        System.out.println("=== Pekerja ===");
        Pekerja g = new Pekerja("G", true, "111", true, 1000,3,2,2024,2 );
        System.out.println(g);
        System.out.println();
        
        Pekerja h = new Pekerja("H", true, "111", true, 1000,3,2,2017,2 );
        System.out.println(h);
        System.out.println();
        
        Pekerja i = new Pekerja("I", true, "111", true, 1000,3,2,2006,10 );
        System.out.println(i);
        System.out.println();
        
        System.out.println("=== Manajer ===");
        Manajer j = new Manajer("J", true, "111", true, 7500,1,2,2011,3, "HRD");
        System.out.println(j);

    }
}
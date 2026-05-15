package tugaspraktikum.tugaspraktikum11;

import java.util.ArrayList;
import java.util.Collections;

public class cariTinggi {
    public static void main(String[] args) {
        ArrayList<Pemain> teamA = new ArrayList<>();
        ArrayList<Pemain> teamB = new ArrayList<>();
        
        teamA.add(new Pemain(168, 50));
        teamA.add(new Pemain(170, 60));
        teamA.add(new Pemain(165, 56)); 
        teamA.add(new Pemain(168, 55));
        teamA.add(new Pemain(172, 60));
        teamA.add(new Pemain(170, 70));
        teamA.add(new Pemain(169, 66));
        teamA.add(new Pemain(165, 56));
        teamA.add(new Pemain(171, 72));
        teamA.add(new Pemain(166, 56));
        
        teamB.add(new Pemain(170, 66));
        teamB.add(new Pemain(167, 60));
        teamB.add(new Pemain(165, 59));
        teamB.add(new Pemain(166, 58));
        teamB.add(new Pemain(168, 58));
        teamB.add(new Pemain(175, 71));
        teamB.add(new Pemain(172, 68));
        teamB.add(new Pemain(171, 68));
        teamB.add(new Pemain(168, 65));
        teamB.add(new Pemain(169, 60)); 

        ArrayList<Integer> TbB = new ArrayList<>();
        for (Pemain pemain : teamB) {
           TbB.add(pemain.tinggi);
        }
        Collections.sort(TbB);
    
        
        System.out.println("Tinggi badan team B: " + TbB);
        System.out.println();
        int hasil1 = Search.jumlah(TbB, 168);
        System.out.println("Jumlah pemain dengan tinggi 168: " + hasil1);
        Search.binarySearch(TbB, 168);
        int hasil2 = Search.jumlah(TbB, 160);
        System.out.println("\nJumlah pemain dengan tinggi 160: " + hasil2);
        Search.binarySearch(TbB, 160);

    }
}

class Pemain {
    int tinggi;
    int berat;

    Pemain(int tinggi, int berat) {
        this.tinggi = tinggi;
        this.berat = berat;
    }
}

class Search {

    public static int jumlah(ArrayList<Integer> search, int tinggi) {
        return Collections.frequency(search, tinggi);
    }

    public static void binarySearch(ArrayList<Integer> search, int tinggi) {
        int result = 0;
        System.out.printf( "Tinggi yang dicari: %s\n", tinggi );
        result = Collections.binarySearch( search, tinggi );
        if(result>=0)System.out.printf( "Ada di index %d\n", result );
        else System.out.printf( "Tidak ada (%d)\n",result );
    }

    
}
package tugaspraktikum.tugaspraktikum11;

import java.util.ArrayList;
import java.util.Collections;

public class cariBeratBadan {
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

        ArrayList<Integer> BbA = new ArrayList<>();
        for (Pemain pemain : teamA) {
           BbA.add(pemain.berat);
        }
        Collections.sort(BbA);
    
        
        System.out.println("Berat badan team A: " + BbA);
        System.out.println();
        int hasil1 = Search.jumlah(BbA, 56);
        System.out.println("Jumlah pemain dengan berat 56: " + hasil1);
        Search.binarySearch(BbA, 56);
        int hasil2 = Search.jumlah(BbA, 53);
        System.out.println("\nJumlah pemain dengan berat 53: " + hasil2);
        Search.binarySearch(BbA, 53);

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

    public static int jumlah(ArrayList<Integer> search, int berat) {
        return Collections.frequency(search, berat);
    }

    public static void binarySearch(ArrayList<Integer> search, int berat) {
        int result = 0;
        System.out.printf( "Berat yang dicari: %s\n", berat );
        result = Collections.binarySearch( search, berat );
        if(result>=0)System.out.printf( "Ada di index %d\n", result );
        else System.out.printf( "Tidak ada (%d)\n",result );
    }

    
}


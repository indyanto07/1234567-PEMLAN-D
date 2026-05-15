package tugaspraktikum.tugaspraktikum11;

import java.util.ArrayList;
import java.util.Collections;

public class cariSamaAdanB {
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

        ArrayList<Integer> TbA = new ArrayList<>();
        for (Pemain pemain : teamA) {
           TbA.add(pemain.tinggi);
        }
        Collections.sort(TbA);
        
        ArrayList<Integer> BbB = new ArrayList<>();
        for (Pemain pemain : teamB) {
           BbB.add(pemain.berat);
        }
        Collections.sort(BbB);
        
        ArrayList<Integer> TbB = new ArrayList<>();
        for (Pemain pemain : teamB) {
           TbB.add(pemain.tinggi);
        }
        Collections.sort(TbB);

        System.out.println("Tinggi badan team A: " + TbA);
        System.out.println("Tinggi badan team B: " + TbB);
        System.out.println("Berat badan team B: " + BbB);
        System.out.println("Berat badan team A: " + BbA);
        System.out.println();

        System.out.println("\nTinggi badan yang sama:");

        ArrayList<Integer> tinggiSama = new ArrayList<>();

        for (Integer t : TbA) {
        if (TbB.contains(t) && !tinggiSama.contains(t)) {
                tinggiSama.add(t);
            }
        }

        System.out.println(tinggiSama);

        for (Integer t : tinggiSama) {
            Search.binarySearch(TbA, t);
        }

        System.out.println("\nBerat badan yang sama:");

        ArrayList<Integer> beratSama = new ArrayList<>();

        for (Integer b : BbA) {
            if (BbB.contains(b) && !beratSama.contains(b)) {
                beratSama.add(b);
            }
        }

        System.out.println(beratSama);

        for (Integer b : beratSama) {
            Search.binarySearch(BbA, b);
        }
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

    public static void binarySearch(ArrayList<Integer> search, int angka) {
        int result = 0;
        System.out.printf( "Angka yang dicari: %s\n", angka );
        result = Collections.binarySearch( search, angka );
        if(result>=0)System.out.printf( "Ada di index %d\n", result );
        else System.out.printf( "Tidak ada (%d)\n",result );
    }
}
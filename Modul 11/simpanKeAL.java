package tugaspraktikum.tugaspraktikum11;

import java.util.ArrayList;

public class simpanKeAL {
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
    }
}

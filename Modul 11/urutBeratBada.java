package tugaspraktikum.tugaspraktikum11;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class urutBeratBada {
    public static void main(String[] args) {
        int[] BbA = {50, 60, 56, 55, 60, 70, 66, 56,72, 56};
        int[] BbB = {66, 60, 59, 58, 58, 71, 68, 68, 65, 60};
        
        int [] gabungan = new int[BbA.length + BbB.length];

        for (int i = 0; i < BbA.length; i++) {
            gabungan[i] = BbA[i];
        }
        for (int i = 0; i < BbB.length; i++) {
            gabungan[BbA.length + i] = BbB[i];
        }
        List<Integer> list = Arrays.stream(gabungan).boxed().collect(java.util.stream.Collectors.toList());
        
        System.out.println("Berat badan team A:");
        for (int data : BbA) {
            System.out.print(data + " ");
        }        
        System.out.println();
        System.out.println();
        
        System.out.println("Berat badan team B:");
        for (int data : BbB) {
            System.out.print(data + " ");
        }        
        System.out.println();
        System.out.println();
        
        Collections.sort(list);
        
        System.out.println("Urutan berat badan secara Ascending: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("\nUrutan berat badan secara Descending: " + list);
    }
}
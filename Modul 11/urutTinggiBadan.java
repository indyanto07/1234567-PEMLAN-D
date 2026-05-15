package tugaspraktikum.tugaspraktikum11;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class urutTinggiBadan {
    public static void main(String[] args) {
        int[] TbA = {168, 170, 165, 168, 172, 170, 169, 165, 171, 166};
        int[] TbB = {170, 167, 165, 166, 168, 175, 172, 171, 168, 169};
        
        int [] gabungan = new int[TbA.length + TbB.length];

        for (int i = 0; i < TbA.length; i++) {
            gabungan[i] = TbA[i];
        }
        for (int i = 0; i < TbB.length; i++) {
            gabungan[TbA.length + i] = TbB[i];
        }
        
        List<Integer> list = Arrays.stream(gabungan).boxed().collect(java.util.stream.Collectors.toList());


        System.out.println("Tinggi badan team A:");
        for (int data : TbA) {
            System.out.print(data + " ");
        }        
        System.out.println();
        System.out.println();
        
        System.out.println("Tinggi badan team B:");
        for (int data : TbB) {
            System.out.print(data + " ");
        }        
        System.out.println();
        System.out.println();
        
        Collections.sort(list);
        System.out.println("Tinggi badan yang diurut dengan Ascending: "+list);
       
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("\nTinggi badan yang diurut dengan Descending: "+list);
    }
}

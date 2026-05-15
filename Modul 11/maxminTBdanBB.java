package tugaspraktikum.tugaspraktikum11;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class maxminTBdanBB {
    public static void main(String[] args) {
        int[] BbA = {50, 60, 56, 55, 60, 70, 66, 56,72, 56};
        int[] BbB = {66, 60, 59, 58, 58, 71, 68, 68, 65, 60};

        int[] TbA = {168, 170, 165, 168, 172, 170, 169, 165, 171, 166};
        int[] TbB = {170, 167, 165, 166, 168, 175, 172, 171, 168, 169};

        List<Integer> listBA = Arrays.stream(BbA).boxed().collect(java.util.stream.Collectors.toList());
        List<Integer> listBB = Arrays.stream(BbB).boxed().collect(java.util.stream.Collectors.toList());
        List<Integer> listTA = Arrays.stream(TbA).boxed().collect(java.util.stream.Collectors.toList());
        List<Integer> listTB = Arrays.stream(TbB).boxed().collect(java.util.stream.Collectors.toList());

        System.out.println("Berat badan team A:"+listBA);
        System.out.println("Max Berat badan team A: " + Collections.max(listBA));
        System.out.println("Min Berat badan team A: " + Collections.min(listBA));
        System.out.println();

        System.out.println("Berat badan team B:"+listBB);
        System.out.println("Max Berat badan team B: " + Collections.max(listBB));
        System.out.println("Min Berat badan team B: " + Collections.min(listBB));
        System.out.println();

        System.out.println("Tinggi badan team A:"+listTA);
        System.out.println("Max Tinggi badan team A: " + Collections.max(listTA));
        System.out.println("Min Tinggi badan team A: " + Collections.min(listTA));
        System.out.println();
        
        System.out.println("Tinggi badan team B:"+listTB);
        System.out.println("Max Tinggi badan team B: " + Collections.max(listTB));
        System.out.println("Min Tinggi badan team B: " + Collections.min(listTB));

    }
}
package tugaspraktikum.tugaspraktikum11;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class copyTeam {
    public static void main(String[] args) {
        int[] BbB = {66, 60, 59, 58, 58, 71, 68, 68, 65, 60};
        int[] TbB = {170, 167, 165, 166, 168, 175, 172, 171, 168, 169};

        List<Integer> listBbB = Arrays.stream(BbB).boxed().collect(java.util.stream.Collectors.toList());
        List<Integer> listTbB = Arrays.stream(TbB).boxed().collect(java.util.stream.Collectors.toList());

        System.out.println("Berat badan team B:"+listBbB);
        System.out.println("Tinggi badan team B:"+listTbB);

        int[] BbC = new int[BbB.length];
        int[] TbC = new int[TbB.length];
        List<Integer> ListBbC = Arrays.stream(BbC).boxed().collect(java.util.stream.Collectors.toList());
        List<Integer> ListTbC = Arrays.stream(TbC).boxed().collect(java.util.stream.Collectors.toList());

        Collections.copy(ListBbC, listBbB);
        Collections.copy(ListTbC, listTbB);
        System.out.println("\nBerat badan team C:"+ListBbC);
        System.out.println("Tinggi badan team C:"+ListTbC);
    }
}

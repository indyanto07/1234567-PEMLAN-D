package tugaspraktikum.tugaspraktikum11;

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
        for (int i = 0; i < gabungan.length - 1; i++) {
            for (int j = 0; j < gabungan.length - i - 1; j++) {
                if (gabungan[j] > gabungan[j + 1]) {
                    int temp = gabungan[j];
                    gabungan[j] = gabungan[j + 1];
                    gabungan[j + 1] = temp;
                }
            }
        }
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
        
        System.out.println("Tinggi badan yang diurut dengan Ascending:");
        for (int tinggi : gabungan) {
            System.out.print(tinggi + " ");
        }
        
        System.out.println();
        for (int i = 0; i < gabungan.length - 1; i++) {
            for (int j = 0; j < gabungan.length - i - 1; j++) {
                if (gabungan[j] < gabungan[j + 1]) {
                    int temp = gabungan[j];
                    gabungan[j] = gabungan[j + 1];
                    gabungan[j + 1] = temp;
                }
            }
        }
        System.out.println("\nTinggi badan yang diurut dengan Descending:");
        for (int tinggi : gabungan) {
            System.out.print(tinggi + " ");
        }
    }
}

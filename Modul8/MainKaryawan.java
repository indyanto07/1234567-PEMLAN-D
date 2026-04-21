package tugaspraktikum.tugaspraktikum8;

public class MainKaryawan {
    public static void main(String[] args) {

        Invoice belanja1 = new Invoice("Shampo", 2, 15000);
        Invoice belanja2 = new Invoice("Pasta Gigi", 1, 75000);
        Invoice belanja3 = new Invoice("Sabun Mandi", 3, 5000);
       
        Invoice[] listBelanja = {belanja1, belanja2, belanja3};


        Employee emp = new Employee(1234567890, "Pak bahlil", 5000000, listBelanja);

        emp.displayInfo();
    }
}
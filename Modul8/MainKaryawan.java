package tugaspraktikum.tugaspraktikum8;

public class MainKaryawan {
    public static void main(String[] args) {

        Invoice belanja1 = new Invoice("Susu Beruang", 2, 15000);
        Invoice belanja2 = new Invoice("Beras 5kg", 1, 75000);
        Invoice belanja3 = new Invoice("Sabun Mandi", 3, 5000);
       
        Invoice[] listBelanja = {belanja1, belanja2, belanja3};


        Employee emp = new Employee(1024, "Budi Meneer", 5000000, listBelanja);

        emp.displayInfo();
    }
}
package tugaspraktikum.tugaspraktikum8;

public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private double salary;
    private Invoice[] Invoices;
    
    public Employee(int registrationNumber, String name, double salary, Invoice[] Invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salary = salary;
        this.Invoices = Invoices;
    }
    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public double getPayableAmount() {
        double totalHutang = 0;
        if (Invoices != null) {
            for (Invoice inv : Invoices) {
                if (inv != null) {
                    totalHutang += inv.getPayableAmount();
                }
            }
        }
        return salary - totalHutang;
    }
    public double getTotalBelanja() {
        double total = 0;
        if (Invoices != null) {
            for (Invoice inv : Invoices) {
                if (inv != null) {
                    total += inv.getPayableAmount();
                }
            }
        }
        return total;
    }
    
    public void displayInfo() {
        System.out.println("======================== Data Karyawan ================================");
    
        System.out.println("Nama            : " + name);
        System.out.println("No. Registrasi  : " + registrationNumber);
        System.out.printf("Gaji Kotor      : Rp %,.2f%n", salary);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("DETAIL BELANJA KOPERASI:");
        
        if (Invoices == null || Invoices.length == 0) {
            System.out.println("- Tidak ada belanjaan -");
        } else {
            for (Invoice inv : Invoices) {
                if (inv != null) {
                    System.out.println(inv.toString());
                }
            }
        }
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("TOTAL BELANJA   : Rp " + String.format("%,.2f", getTotalBelanja()));
        System.out.printf("GAJI AKHIR (Setelah Potong): Rp %,.2f%n", getPayableAmount());
        System.out.println("========================================================================");
    }
}

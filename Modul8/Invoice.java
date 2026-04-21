package tugaspraktikum.tugaspraktikum8;

public class Invoice implements Payable {
    private String ProdukName;
    private int Quantity;
    private double PricePerItem;


    public Invoice(String ProdukName, int Quantity, double PricePerItem) {
        this.ProdukName = ProdukName;
        this.Quantity = Quantity;
        this.PricePerItem = PricePerItem;
    }

    public String getProdukName() {
        return ProdukName;
    }

    public void setProdukName(String ProdukName) {
        this.ProdukName = ProdukName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public double getPricePerItem() {
        return PricePerItem;
    }

    public void setPricePerItem(double PricePerItem) {
        this.PricePerItem = PricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return Quantity * PricePerItem;
    }
    @Override
    public String toString() {
        return String.format("%-15s | %-3d | Rp %,-10.2f | Total: Rp %,-10.2f", 
                ProdukName, Quantity, PricePerItem, getPayableAmount());
    }
}

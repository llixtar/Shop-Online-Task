package app.entity;

public class Purchase {

    private final int quantity;
    private final double price;
    private final String nameProd;

    public Purchase(int quantity, double price, String nameProd) {

        this.quantity = quantity;
        this.price = price;
        this.nameProd = nameProd;
    }
    //------------------------------------------------------------------------------------------------------------------
    public int getQuantity() {
        return quantity;
    }
    //------------------------------------------------------------------------------------------------------------------
    public double getPrice() {
        return price;
    }
    //------------------------------------------------------------------------------------------------------------------
    public String getNameProd() {
        return nameProd;
    }
    //------------------------------------------------------------------------------------------------------------------
}

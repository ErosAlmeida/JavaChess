package entities;

public class OrderItem {
    private Integer quantity;
    private Double priceOrder;
    private Product product;

    public OrderItem(){
    }

    public OrderItem(Integer quantity, Double priceOrder, Product product) {
        this.quantity = quantity;
        this.priceOrder = priceOrder;
        this.product = product;
    }

  
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Double getPriceOrder() {
        return priceOrder;
    }

    public void setPriceOrder(Double priceOrder) {
        this.priceOrder = priceOrder;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public double subTotal(){
        return priceOrder * quantity;
    }
   
   @Override
   public String toString(){
    return getProduct().getNameProduct()

    + ", $"
    + String.format("%.2f", priceOrder)
    + ", Quantity: "
    + quantity
    + ", Subtotal: $"
    + String.format("%.2f", subTotal());
   }

}

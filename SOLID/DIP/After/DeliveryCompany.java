package SOLID.DIP.After;

public class DeliveryCompany implements DeliveryService{
    @Override
    public void deliverProduct(Product product) {
        // deliver product...
    }

    void sendProduct(Product product) {
        deliverProduct(product);
    }
}
